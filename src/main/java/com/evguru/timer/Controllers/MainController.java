package com.evguru.timer.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainController {

    private final UsersTabController usersTabController;

    @Autowired
    public MainController(
            UsersTabController usersTabController
    ) {
        this.usersTabController = usersTabController;
    }
}
