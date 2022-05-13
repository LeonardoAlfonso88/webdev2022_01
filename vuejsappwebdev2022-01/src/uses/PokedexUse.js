import { pokemonListService } from "../services/itemsList/pokemonListService";
import { computed, onMounted, ref } from "vue";
import { apiPokedex } from "../services/pokedex/apiPokedex";

export function pokedexUse() {
  const { getListPokemon } = pokemonListService();
  const { getAllPokemon, createPokemon } = apiPokedex();
  const pokemons = ref([]);
  const pokemonsSecondGeneration = ref([])
  const actualPokemon = ref(null);

  onMounted(async () => {
    pokemons.value = await getListPokemon();
    pokemonsSecondGeneration.value = await getAllPokemon();
    console.log(pokemons.value);
  });

  function showDescription(pokemon) {
    actualPokemon.value = pokemon;
  }

  async function createPokemonUse(name, weight, type, description) {
    const pokemon = {
      name: name,
      weight: weight,
      type: type,
      description: description,
    }

    await createPokemon(JSON.stringify(pokemon));
  }

  function cleanActualPokemon() {
    actualPokemon.value = null;
  }

  function changePokemonName(newnewName) {
    actualPokemon.value.name = newnewName;
  }

  function getImage(nameImage) {
    return require("@/assets/".concat(nameImage));
  }

  const hasPokemon = computed(() => {
    return actualPokemon.value !== null;
  });

  return {
    pokemons,
    actualPokemon,
    showDescription,
    cleanActualPokemon,
    changePokemonName,
    hasPokemon,
    getImage,
    createPokemonUse,
  };
}
