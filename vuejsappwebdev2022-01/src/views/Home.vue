<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png" />
    <HelloWorld msg="Esto asdnasdasd de props" />
    <button @click="goToPokedex">Ir a Pokedex</button>
    <button @click="goToAbout">Ir a About</button>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from "@/components/HelloWorld.vue";
import { HomeUse } from "../uses/HomeUse"

export default {
  name: "Home",
  components: {
    HelloWorld,
  },
  setup() {
    const { goToPokedex, goToAbout } = HomeUse();

    return { goToPokedex, goToAbout }
  }
};
</script>

<style>

</style>
