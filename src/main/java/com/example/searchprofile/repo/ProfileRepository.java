package com.example.searchprofile.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.searchprofile.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long>{

}
