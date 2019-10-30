package com.utm.udrive.TransportSharingApp.Dao;

import com.utm.udrive.TransportSharingApp.Services.User;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<User, String> {
}
