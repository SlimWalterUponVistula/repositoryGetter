package com.smartepsilon.backend;

import com.smarepsilon.gitrepo.model.GithubRepository;

public interface RepositoryClient {

	GithubRepository getRepository(String owner, String id);
}
