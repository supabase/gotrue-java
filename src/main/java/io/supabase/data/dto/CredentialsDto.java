package io.supabase.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CredentialsDto {
    @JsonProperty("email")
    String email;
    @JsonProperty("password")
    String password;
}
