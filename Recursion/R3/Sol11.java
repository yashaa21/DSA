//Remove the character

class Sol11 {

       public static String removeCharacter(String str, char toRemove) {
        
        if (str.isEmpty()) {
            return str;
        }
        char firstChar = str.charAt(0);
        if (firstChar == toRemove) {
                      return removeCharacter(str.substring(1), toRemove);
        } else {
            
            return firstChar + removeCharacter(str.substring(1), toRemove);
        }
    }

    
    public static void main(String[] args) {
        String input = "programming";
        char toRemove = 'm';
        String result = removeCharacter(input, toRemove);
        System.out.println("Original String: " + input);
        System.out.println("String after removing '" + toRemove + "': " + result);
    }
}
