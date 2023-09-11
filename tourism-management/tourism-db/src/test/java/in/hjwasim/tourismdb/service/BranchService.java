package in.hjwasim.tourismdb.service;

import in.hjwasim.tourismdb.dto.BranchCreateResponse;
import in.hjwasim.tourismdb.entity.Branch;
import in.hjwasim.tourismdb.models.DbConstants;
import in.hjwasim.tourismdb.repository.BranchRepository;
import in.hjwasim.tourismdb.vo.BranchCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Hjwasim
 */
@Service
@RequiredArgsConstructor
public class BranchService {

    private final BranchRepository branchRepository;

    private Branch mapVoToEntity(BranchCreateRequest request) {
        return Branch.builder()
                .name(request.getName())
                .contact(Long.parseLong(request.getContact()))
                .email(request.getEmail())
                .website(request.getWebsite())
                .place(request.getPlace())
                .packageList(request.getPackageList())
                .build();
    }

    public BranchCreateResponse createBranch(final BranchCreateRequest branchCreateRequest) throws Exception {
        try {
            Branch branch = mapVoToEntity(branchCreateRequest);
            this.branchRepository.save(branch);
        } catch (Exception e) {
            throw new Exception(DbConstants.FAILURE_MESSAGE_CREATE);
        }
        return new BranchCreateResponse(DbConstants.SUCCESS, DbConstants.SUCCESS_CODE, DbConstants.SUCCESS_MESSAGE_CREATE);
    }

    public BranchCreateResponse updateBranch(final BranchCreateRequest branchCreateRequest) throws Exception {
        try {
            Branch branch = mapVoToEntity(branchCreateRequest);
            this.branchRepository.save(branch);
        } catch (Exception e) {
            throw new Exception(DbConstants.FAILURE_MESSAGE_CREATE);
        }
        return new BranchCreateResponse(DbConstants.SUCCESS, DbConstants.SUCCESS_CODE, DbConstants.SUCCESS_MESSAGE_CREATE);
    }
}
