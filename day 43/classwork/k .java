const friend1 = {
    name: "dato",
    age: 25,
    city: "zestaponi",
    profession: "Developer",
    hobby: "swimming"
};

const friend2 = {
    name: "luka",
    age: 28,
    city: "Kutaisi",
    profession: "Designer",
    hobby: "Painting"
};

const friend3 = {
    name: "misho",
    age: 30,
    city: "tbilisi",
    profession: "Engineer",
    hobby: "walking down the street"
};
// სამივე ობიექტის დაბეჭდვა
console.log(friend1);
console.log(friend2);
console.log(friend3);

// ერთ-ერთი კუთვნილების დაბეჭდვა
console.log(friend1.city); // Outputs: zestaponi

// ერთ-ერთი ობიექტის კუთვნილების შეცვლა
friend1.city = "zastava";

// ახალი მნიშვნელობის დაბეჭდვა
console.log(friend1.city); // Outputs: gldani