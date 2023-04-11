package com.stl.preety.telecomapp.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stl.preety.telecomapp.exception.ConnectionTypeException;
import com.stl.preety.telecomapp.model.Connection;
import com.stl.preety.telecomapp.repository.ConnectionRepository;
import com.stl.preety.telecomapp.service.ConnectionService;

@Service
public class ConnectionServiceImpl implements ConnectionService {

	private static final Logger logger = LoggerFactory.getLogger(ConnectionServiceImpl.class);

	@Autowired
	private ConnectionRepository repo; // we are injecting the repo object into ConnectionServiceImpl class

	@Override
	public Iterable<Connection> getAllConnection() {
		logger.info("Connection Service Implementation : getAllConnections() method");
		return repo.findAll(); // to get the all list
	}


	@Override
	public Connection saveConnection(Connection connection) {
		logger.info("Connection Service Implementation : saveConnection() method");
		return repo.save(connection); // return connection;
	}

	@Override
	public Optional<Connection> getConnectionById(Integer Id) {
		logger.info("Connection Service Implementation : getConnectionById() method");
		
		Optional<Connection> connection = repo.findById(Id);
	   
		if(connection.isEmpty()) { //6==null or null==null
			throw new ConnectionTypeException("Connection id "+Id+" incorrect..");
		}
		return connection;
	}

	@Override
	public void deleteConnection(Integer id) {
		logger.info("Connection Service Implementation : deleteConnection() method");
		repo.deleteById(id);
	}

}
