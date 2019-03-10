package com.markandmax.ppmtool.services;

import com.markandmax.ppmtool.domain.Project;
import com.markandmax.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        return projectRepository.save(project);
    }
}
