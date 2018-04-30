package com.smartepsilon.gitrepo.service;

import com.smarepsilon.gitrepo.model.GithubRepository;
import com.smartepsilon.backend.GithubRepositoryBackend;

public class GithubRepositoryServiceImpl implements GithubRepositoryService {

	private final GithubRepositoryBackend githubRepositoryBackend;
	
	public GithubRepositoryServiceImpl(GithubRepositoryBackend githubRepositoryBackend) {
		this.githubRepositoryBackend = githubRepositoryBackend;
	}
	
	public GithubRepository readByOwnerAndRepositoryName(String owner, String repositoryName) {
		return githubRepositoryBackend.read(owner, repositoryName);
	}
}
