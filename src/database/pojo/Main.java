package database.pojo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<Movie> movies = new ArrayList<>();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "Root");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM movieeeeee");
            while (resultSet.next()) {

                movies.add(new Movie(resultSet.getInt("id"), resultSet.getString("title"),
                        resultSet.getInt("year"), resultSet.getString("imdbl")));

             }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(movies);


        ////////////////////////////////city//////////////////////////////
        List<City> city = new ArrayList<>();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "Root");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM city");
            while (resultSet.next()) {

                city.add(new City(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(4), resultSet.getInt(3)));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        Stream<Map.Entry<String, List<City>>> stream = city.stream().collect(Collectors.groupingBy(City::getCountryCode)).entrySet().stream();
      //  stream.




//        System.out.println(collect.get("33").stream().max(Comparator.comparing(City::getPopulation)));
//        System.out.println(collect.get("22").stream().max(Comparator.comparing(City::getPopulation)));
//        System.out.println(collect.get("11").stream().max(Comparator.comparing(City::getPopulation)));

//
//        System.out.println(city);
//        System.out.println(collect);

        //ArrayList<City> cities=getCount();
//        Comparator<City> cityComparator = Comparator.
//                comparing(City::getCountryCode)
//                .thenComparing(City::getPopulation);
//        List<City> sortedCollect = city.stream()
//                .max(cityComparator).collect(Collectors.toList());
//        System.out.println(sortedCollect);
    }
//        private static  ArrayList<City> getCount(){
//
//    ArrayList<City> arrayList=new ArrayList<>();
//    arrayList.add(new City());
//
//    return arrayList;
//    }
}

       // List<List<City>> ints = new ArrayList<>();
      // ints.add(city);
     // City Max= ints.stream().max(Comparator.comparing(City::getPopulation)).get();
     //  System.out.println(ints.get(1).stream().max(Comparator.comparing(City::getPopulation)).get());
//        System.out.println(city);
//


       // cityStream.forEach(System.out::println);


        //flatMap(Collection::stream).

//        City city1 = city.stream().collect(Collectors.groupingBy(City::getCountryCode)).values().stream().flatMap(Collection::stream).max(Comparator.comparing(City::getPopulation)).get();
//        Collection<List<City>> values = city.stream().collect(Collectors.groupingBy(City::getCountryCode)).values();
//
//
//
//        System.out.println(values);
        //System.out.println(values);




///////////////////////COUNTRY////////////////////////////////////////////////////////


//    List<Country> countries = new ArrayList<>();
//
//
//        try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "Root");
//
//                Statement statement = connection.createStatement();
//                ResultSet resultSet = statement.executeQuery("SELECT * FROM country");
//                while (resultSet.next()) {
//
////                    countries.add(new Movie(resultSet.getString(1 ),resultSet.getString("name"), resultSet.getString("continent"),
////                            resultSet.getDouble("surfaceArea"), resultSet.getInt("population"),resultSet.getDouble("gnp"),resultSet.getInt("capital")));
//
//                }
//                } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//                } catch (SQLException e) {
//                e.printStackTrace();
//                }
//
//                System.out.println(countries);

         //       }

            //    }
////////////////////////////////////////////////////////////////////////////


