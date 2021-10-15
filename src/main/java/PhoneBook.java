import com.sun.jdi.ArrayReference;

import java.util.*;

public class PhoneBook {

    private Map<String,ArrayList<String>> phonebook;

    public PhoneBook(){
         phonebook = new TreeMap<>();
    }

    public void add(String name, String phoneNumber){
        if (hasEntry(name)){
            ArrayList<String> phoneBookNumbers = phonebook.get(name);
            phoneBookNumbers.add(phoneNumber);
        }
        else{
            phonebook.put(name,new ArrayList<>(Collections.singleton(phoneNumber)));
        }
    }

    public void addAll(String name, String... phoneNumbers){
        if (hasEntry(name)){
            ArrayList<String> phoneBookNumbers = phonebook.get(name);
            phoneBookNumbers.addAll(Arrays.asList(phoneNumbers));
        }
        else{
            phonebook.put(name,new ArrayList<>());
        }
    }

    public Boolean hasEntry(String name){
        if (phonebook.containsKey(name)){
            return true;
        }
        else{
            return false;
        }
    }

    public void remove(String name){
        phonebook.remove(name);
    }

    public List<String> lookup(String name){
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber){
        for (Map.Entry<String,ArrayList<String>> phoneBookEntry : phonebook.entrySet()){
            if (phoneBookEntry.getValue().contains(phoneNumber)){
                return phoneBookEntry.getKey();
            }
        }
        return "No Entry";
    }

    public String getAllContactNames(){
        String names = "";

        for (Map.Entry<String,ArrayList<String>> phoneBookEntry : phonebook.entrySet()){
            names += phoneBookEntry.getKey() + " ";

        }

        return names;
    }

}
