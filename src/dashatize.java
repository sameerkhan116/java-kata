class dashatize {
    public static String dashatize(int num) {
        return Integer.toString(num).replaceAll("([13579])", "-$1-").replaceAll("--", "-").replaceAll("^-", "").replaceAll("-$", "");
    }

    public static void main(String[] args){
        System.out.println(dashatize(274));
        System.out.println(dashatize(6815));        
    }
}