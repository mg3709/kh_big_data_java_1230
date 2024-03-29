async function myFunction() {
    const res1 = await fetch(
      "https://jsonplaceholder.typicode.com/posts/1"
    );
    const res1Json = await res1.json();
    console.log(res1Json);

    const res2 = await fetch(
      "https://jsonplaceholder.typicode.com/posts/1",
      {
        method: "PUT",
        body: JSON.stringify({
          id: 1,
          title: "foo",
          body: "bar",
          userId: 1,
        }),
        headers: {
          "Content-type": "application/json; charset=UTF-8",
        },
      }
    );
    const res2Json = await res2.json();
    console.log(res2Json);
  }

  myFunction();