package in.hjwasim.tourismdb.dto;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @author Hjwasim
 */
@Setter
@AllArgsConstructor
public class BranchCreateResponse {
    private String status;
    private Integer status_code;
    private String message;
}
