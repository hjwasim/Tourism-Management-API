package in.hjwasim.tourismdb.vo;

import in.hjwasim.tourismdb.entity.Package;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hjwasim
 */
@Getter
public class BranchCreateRequest {
    private String name;
    private String place;
    private String website;
    private String contact;
    private String email;
    private final List<Package> packageList = null;
}
