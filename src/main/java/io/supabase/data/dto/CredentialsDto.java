package io.supabase.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CredentialsDto {
    @JsonProperty("email")
    String email;
    @JsonProperty("password")
    String password;
}
