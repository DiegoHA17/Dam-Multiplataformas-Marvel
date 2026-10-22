package domain;



class GetSuperHeroesUseCase (private val superHeroeRepository: SuperHeroeRepository){
    operator fun invoke(): List<Superheroe> {
        return superHeroeRepository.getAll();
    }
}
