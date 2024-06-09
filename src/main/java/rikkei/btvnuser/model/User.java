package rikkei.btth.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "ko dc de trong")
    @Size(min = 5, max = 20, message = "5-20 ki tu")
    private String username;

    @Column(nullable = false)
    @NotBlank(message = "ko dc de trong")
    @Size(min = 8, message = "it nhat 8 ki tu")
    private String password;

    @Column(nullable = false)
    @NotBlank(message = "ko dc de trong")
    private String fullName;

    @Column(nullable = false)
    @NotBlank(message = "ko dc de trong")
    private String address;

    @Column(nullable = false)
    @Email(message = "sai")
    @NotBlank(message = "ko dc de trong")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "ko dc de trong")
    @Pattern(regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$", message = "sai")
    private String phone;

    @Column(nullable = false)
    private Boolean status;
}
