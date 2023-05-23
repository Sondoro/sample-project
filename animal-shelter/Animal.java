class Animal {
    public String mSpecies;
    public String mBreed;
    public String mColor;
    public String mAge;

    public Animal(String species, String breed, String color, String age) {
        mSpecies = species;
        mBreed = breed;
        mColor = color;
        mAge = age;
    }

    public boolean myPet(String petType) {
        return (mSpecies.equals(petType));
    }
}