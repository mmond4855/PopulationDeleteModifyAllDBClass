package PopulationDeleteModifyAllDBClass;


public class PopulationDeleteAllModifyDBClass
{

    public static void main(String[] args)
    {
        //For connecting to database.
       String dbDirectory = "F:/CIS2206 - Business Programming I/";
       String dbName = "PopulationDB2";
       
       
       int TownNumberIn = 17;
       int populationIn = 456825;
       
       //Connects to database.
       PopulationDatabaseOperations.setConnection(dbDirectory, dbName);
    
       //Retrieves town
       Town town = PopulationDatabaseOperations.retrieveTown(TownNumberIn);    
       
       //Prints the towns
       printTown(town);
       
       //Modifies population.
       PopulationDatabaseOperations.modifyPopulation(TownNumberIn, populationIn);
       town = PopulationDatabaseOperations.retrieveTown(TownNumberIn);
       
       printTown(town);

        System.out.println("DATABASE COMPLETE");
       
        
    }
    
    static void printTown(Town town)
    {
        
            System.out.println(town.getTownNumber());
            System.out.println(town.getTownName());
            System.out.println(town.getCountyNumber());
            System.out.println(town.getRegionNumber());
            System.out.println(town.getPopulation());
            System.out.println();
        
    
    }
}
