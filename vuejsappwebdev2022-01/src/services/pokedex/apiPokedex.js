export function apiPokedex() {
  async function getAllPokemon() {
    const url = "https://digimon-api.herokuapp.com/api/digimon";
    const config = {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
    };

    const response = await fetch(url, config);

      if (!response.ok) {
          throw new Error(response.error());
      }

    const content = await response.json();

    return {
      content,
    };
  }

  async function createPokemon(body) {
    const url = "https://digimon-api.herokuapp.com/api/digimon";
    const config = {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: body
    };

    const response = await fetch(url, config);

    if (!response.ok) {
      throw new Error(response.error());
    }
  }

  return {
      getAllPokemon,
      createPokemon
  }
}
