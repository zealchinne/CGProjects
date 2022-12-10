package com.work.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDTO {

	@NotBlank(message = "empty not allowed")
	@NotNull(message = "name is null")
	@Size(min = 3, max = 10, message = "Name must be within 3-10 characters")
	private String name;
	@Email(message = "Invalid email format")
	private String email;
	@NotNull(message = "Phone can not be null")
	@Pattern(regexp = "\\d{10}$", message = " Invalid phone number ")
	private String mobile;
	@Min(value = 1, message = "Invalid Age...")
	@Max(value = 100, message = "Invalid age ")
	private Integer age;
}
