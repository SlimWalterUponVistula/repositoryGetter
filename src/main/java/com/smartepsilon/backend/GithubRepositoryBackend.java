package com.smartepsilon.backend;

import com.smarepsilon.gitrepo.model.GithubRepository;

public interface GithubRepositoryBackend {
	
	GithubRepository read(String owner, String name);
}
