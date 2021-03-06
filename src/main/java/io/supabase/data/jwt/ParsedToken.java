package io.supabase.data.jwt;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Getter
@Setter
public class ParsedToken {
    @JsonProperty("exp")
    Date exp;
    @JsonProperty("sub")
    String sub;
    @JsonProperty("email")
    String email;
    @JsonProperty("app_metadata")
    Map<String, String> appMetadata;
    @JsonProperty("user_metadata")
    Map<String, String> userMetadata;
    @JsonProperty("role")
    String role;
}
