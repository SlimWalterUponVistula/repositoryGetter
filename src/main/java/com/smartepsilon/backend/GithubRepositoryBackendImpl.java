package com.smartepsilon.backend;

import com.smarepsilon.gitrepo.model.GithubRepository;

public class GithubRepositoryBackendImpl implements GithubRepositoryBackend {

	private RepositoryClient githubRepositoryClient;	
	
	public GithubRepositoryBackendImpl(RepositoryClient githubRepositoryClient) {
		this.githubRepositoryClient = githubRepositoryClient;
	}
	
	@Override
	public GithubRepository read(String owner, String name) {
		return githubRepositoryClient.getRepository(owner, name);
	}
}
