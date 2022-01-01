package cz.kallasch.backend.service;

import cz.kallasch.backend.entity.StockPileEntity;
import cz.kallasch.backend.entity.UserEntity;
import cz.kallasch.backend.repository.StockPileRepository;
import org.hsqldb.rights.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StockPileService {

    @Autowired
    private StockPileRepository stockPileRepository;

    public StockPileEntity getStockPile(UserEntity user) {
        return stockPileRepository.findByUser(user.getId());

    }
}
