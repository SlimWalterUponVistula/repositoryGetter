package com.smartepsilon.gitrepo.service;

import com.smarepsilon.gitrepo.model.GithubRepository;

public interface GithubRepositoryService {

	GithubRepository readByOwnerAndRepositoryName(String repositoryOwner, String repositoryName);
	
	//String readByOwnerAndRepositoryName(String repositoryOwner, String repositoryName);
}
