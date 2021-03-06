package com.libertymutual.goforcode.chooseabob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libertymutual.goforcode.chooseabob.models.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
