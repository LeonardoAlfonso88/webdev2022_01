import { pokemonListService } from "../services/itemsList/pokemonListService";
import { computed, onMounted, ref } from "vue";

export function pokedexUse() {
  const { getListPokemon } = pokemonListService();
  const pokemons = ref([]);
  const actualPokemon = ref(null);

  onMounted(async () => {
    pokemons.value = await getListPokemon();
    console.log(pokemons.value);
  });

  function showDescription(pokemon) {
    actualPokemon.value = pokemon;
  }

  function cleanActualPokemon() {
    actualPokemon.value = null;
  }

  function changePokemonName(newnewName) {
    actualPokemon.value.name = newnewName;
  }

  function getImage(nameImage) {
    return require('@/assets/'.concat(nameImage))
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
  };
}
