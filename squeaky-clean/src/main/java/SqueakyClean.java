class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder();
        boolean kebab = false;
        for (char c : identifier.toCharArray()) {
            if (Character.isISOControl(c)) {
                cleaned.append("CTRL");
            } else if (Character.isWhitespace(c)) {
                cleaned.append('_');
            } else if (c == '-') {
                kebab = true;
            } else if (!Character.isLetter(c) || c >= 'α' && c <= 'ω') {
                continue;
            } else if (kebab) {
                cleaned.append(Character.toUpperCase(c));
                kebab = false;
            } else {
                cleaned.append(c);
            }            
        }
        return cleaned.toString();
    }
}
