package cz.kallasch.rest_controller;

import cz.kallasch.backend.entity.StockPileEntity;
import cz.kallasch.backend.entity.UserEntity;
import cz.kallasch.backend.service.StockPileService;
import cz.kallasch.backend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/stockpile")
public class StockPileController {

    @Autowired
    private StockPileService stockPileService;
    @Autowired
    private UserService userService;

    @GetMapping("/{userName}")
    public StockPileEntity getStockPile(@PathVariable String userName) {
        UserEntity user = userService.findByName(userName);
        log.info("Finding stockpile for user: " + user.getName());
        StockPileEntity stockPile = stockPileService.getStockPile(user);
        log.info("Stockpile: " + stockPile.toString());
        return stockPile;
    }

}

