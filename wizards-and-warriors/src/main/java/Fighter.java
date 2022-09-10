abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean spell = false;

    @Override
    boolean isVulnerable() {
        return !spell;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return spell ? 12 : 3;
    }

    void prepareSpell() {
        this.spell = true;
    }

}
