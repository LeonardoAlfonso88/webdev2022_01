import { ref } from "vue";

export function pokemonPokedexDetailsUse() {
  const newName = ref("");

  return {
    newName,
  };
}
