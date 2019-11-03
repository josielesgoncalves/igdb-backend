package br.com.steam.services.interfaces

import br.com.steam.dto.*

interface GameService {

    fun getAllGameCatalog(): List<GameCatalogDTO>

    fun getAllGameReview(gameReviewSearchDTO: GameReviewSearchDTO): List<GameReviewDTO>

    fun getGames(key: String, value: String, size: Int, page: Int): List<GameDTO>

    fun getGames(value: String, size: Int, page: Int): List<GameDTO>

    fun insertReview(gameName: String, newReviewDTO: NewReviewDTO): GameReviewDTO

}