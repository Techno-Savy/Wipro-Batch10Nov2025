Mapping in hibernate :-

a) Pure Hibernate  ->  configuration(hibernate.cfg.xml) --->  SessionFactory (Singleton design pattern) --> Session(per job)
                            Transaction ---> Crud/Queries ---> JDBC Dialect ---> DB(H2( Testing Database / MySql)
(We manually build SessionFactory)                            
b) Spring + Hibernate(JPA) --- >We use LocalSessionFactoryBean instead of manually building the SessionFactory
We delegate factory creation to LocalSessionFactoryBean and manage transactions via HibernateTransactionManager

Mapping are of several types :

One to One --- > unidirectional - One to one --->
Where one entity class is the owner and having the reference of another entity class via foreign key created by hibernate  in owner class itself 
And another class is not having the reference of the owner class 
Taking an example of Student and ReportCard

@Entity  and @OneToOne(cascade = CascadeType.ALL)
@joinColumn(name="foreign_Key name") // Generally it will be a unique key in child table

Cascade -->  If we perform an operation on the parent/owner entity , apply the same operation automatically to the associated child entity

Cascade Types :
Persist --> Save child when saving parent
Merge --> Update child when updating parent
Remove --> Delete child when deleting parent
All --> Includes all above

without cascade manually we have to save the reportcard and student both entities but with cascade Hibernate does it automatically.

In one to one if we query via the student it will work fine but if we try to get the details of student via reportcard  (reportcard.getStudent()) 
it  will not work because report doesn't hold that reference








Bidirectional (Student --- ReportCard)

In child class i.e. ReportCard use @OneToOne(mappedBy="class_reference name you defined in Student main entity") 
                                   private Student student;

Now we can navigate student to reportcard and reportcard to student
Hibernate treats one side as owner (Student with @JoinColumn) and the other side as inverse which is a child (mappedBy in ReportCard) 
Only the owner side updates the foreign key column in the DB



