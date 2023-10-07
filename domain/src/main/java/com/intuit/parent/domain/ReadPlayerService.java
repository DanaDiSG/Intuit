package com.intuit.parent.domain;

import com.intuit.parent.domain.dto.PlayerResponseRecord;

import java.util.List;

public interface ReadPlayerService {
    List<PlayerResponseRecord> getPlayers();

    PlayerResponseRecord getPlayerById(String playerId);
}
