import pokemonList from "./pokemons.json";

export function pokemonListService() {
  async function getListPokemon() {
    return new Promise((resolve) => {
      resolve(pokemonList);
    });
  }

  return {
    getListPokemon,
  };
}
