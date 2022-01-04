package pl.polsl.workflow.manager.server.view;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@ToString
public class GroupPost {

    @ApiModelProperty(required = true, position = 1)
    @NotBlank
    @NonNull
    private String name;

    @ApiModelProperty(required = true, position = 2)
    @Nullable
    private Long managerId;

}
