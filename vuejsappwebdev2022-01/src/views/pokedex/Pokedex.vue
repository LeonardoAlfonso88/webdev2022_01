<template>
  <p>{{ title }}</p>
  <p>Nombre del usuario:  {{ user.name.concat(" ").concat(user.lastName) }}</p>
  <ul class="wrapper-list">
    <li
      v-for="(pokemon, index) in pokemons"
      :key="index"
      @click="showDescription(pokemon)"
    >
      <div class="wrapper-pokemon">
        <p>{{ pokemon.name }}</p>
      </div>
    </li>
  </ul>
  <div v-if="hasPokemon">
    <PokemonDetail
      :name="actualPokemon.name"
      :weight="actualPokemon.weight"
      :is-captured="actualPokemon.isCaptured"
      :path="getImage(actualPokemon.image)"
      @clean="cleanActualPokemon"
      @change="changePokemonName"
    />
  </div>
</template>

<script lang="js">

import { pokedexUse } from "../../uses/PokedexUse";
import PokemonDetail from "../../components/pokedex/PokemonDetail";

export default {
  name: "Pokedex",
  components: {
    PokemonDetail,
  },
  props: {
    title: {
      type: String,
      required: false
    }
  },
  setup() {
    const { pokemons,
      actualPokemon,
      showDescription,
      cleanActualPokemon,
      changePokemonName,
      hasPokemon,
      getImage, user } = pokedexUse();

    return {
      pokemons,
      showDescription,
      actualPokemon,
      hasPokemon,
      cleanActualPokemon,
      changePokemonName,
      getImage,
      user,
    };
  },
};
</script>

<style scoped lang="css">
.wrapper-list {
  list-style: none;
  padding: 2rem;
  background-color: #558c8d;
}

.wrapper-pokemon {
  width: 30%;
  border-radius: 0.8rem;
  background-color: cornflowerblue;
  padding: 0.3rem;
  margin-bottom: 1rem;
  cursor: pointer;
}


</style>
