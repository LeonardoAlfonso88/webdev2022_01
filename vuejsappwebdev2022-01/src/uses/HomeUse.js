import { useRouter } from "vue-router";

export function HomeUse() {
  const router = useRouter();

  async function goToPokedex() {
    const title = "ejemplo-pokemon";
    await router.push("/pokedex/".concat(title));
  }

  async function goToAbout() {
    await router.push("/about");
  }

  return {
    goToPokedex,
    goToAbout,
  };
}
