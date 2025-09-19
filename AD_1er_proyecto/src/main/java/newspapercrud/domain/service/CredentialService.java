package newspapercrud.domain.service;


import jakarta.inject.Inject;
import newspapercrud.dao.CredentialsRepository;
import newspapercrud.dao.model.CredentialsEntity;
import newspapercrud.domain.model.CredentialsDTO;

public class CredentialService {

    private final CredentialsRepository credentialsRepository;

    @Inject
    public CredentialService(CredentialsRepository credentialsRepository) {
        this.credentialsRepository = credentialsRepository;
    }
    public boolean checkLogin(CredentialsDTO credentialsDTO) {
        CredentialsEntity credentialEntity = credentialsRepository.get(credentialsDTO.getUsername());

        return credentialEntity.getPassword().equals(credentialsDTO.getPassword());
    }

}
