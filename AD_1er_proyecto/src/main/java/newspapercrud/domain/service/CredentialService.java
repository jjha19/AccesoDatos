package newspapercrud.domain.service;


import jakarta.inject.Inject;
import newspapercrud.dao.Basic.BasicCredentialsRepository;
import newspapercrud.dao.model.CredentialsEntity;
import newspapercrud.domain.model.CredentialsDTO;

public class CredentialService {

    private final BasicCredentialsRepository basicCredentialsRepository;

    @Inject
    public CredentialService(BasicCredentialsRepository basicCredentialsRepository) {
        this.basicCredentialsRepository = basicCredentialsRepository;
    }
    public boolean checkLogin(CredentialsDTO credentialsDTO) {
        CredentialsEntity credentialEntity = basicCredentialsRepository.get(credentialsDTO.getUsername());

        return credentialEntity.getPassword().equals(credentialsDTO.getPassword());
    }

}
