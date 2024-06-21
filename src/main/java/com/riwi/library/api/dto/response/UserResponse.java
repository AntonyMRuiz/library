package com.riwi.library.api.dto.response;

import com.riwi.library.utils.enums.RoleUser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
   private Long id;
   private String username;
   private String email;
   private String fullName;
   private RoleUser role;
}
