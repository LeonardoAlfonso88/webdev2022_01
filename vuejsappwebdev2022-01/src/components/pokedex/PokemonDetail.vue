<template>
  <img class="img" :src="path" >
  <p>Nombre del pokemon : {{ name }}</p>
  <p>Peso del pokemon : {{ weight }}</p>
  <p>Ha sido capturado este pokemon : {{ isPokemonCaptured }}</p>
  <input type="text" v-model="newName" />
  <button @click="cleanPokemon">Cerrar</button>
  <button @click="changeName">Cambiar Nombre</button>
</template>

<script lang="js">

import {computed} from "vue";
import { pokemonPokedexDetailsUse } from "../../uses/PokemonPokedexDetailsUse";

export default {
  name: "PokemonDetail",
  props: {
    name: {
      type: String,
      default: ""
    },
    weight: {
      type: Number,
      required: true
    },
    isCaptured: {
      type: Boolean,
      default: false
    },
    path : {
      type: String,
      required: true
    }
  },
  setup(props, context) {
    const { newName } = pokemonPokedexDetailsUse()

    function cleanPokemon() {
      context.emit("clean")
    }

    function changeName() {
      context.emit("change", newName.value)
    }

    const isPokemonCaptured = computed(() => {
      return props.isCaptured ? "Si" : "No"
    })

    return {
      cleanPokemon,
      newName,
      changeName,
      isPokemonCaptured,
    }
  }
}
</script>

<style scoped lang="css">
.img {
  width: 10rem;
}
</style>
