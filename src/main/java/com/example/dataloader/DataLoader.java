package com.example.dataloader;

import com.example.model.Category;
import com.example.model.Movie;
import com.example.repository.CategoryRepository;
import com.example.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Sample data
// Code generated with JavaScript - movies extracted from https://www.themoviedb.org/documentation/api
@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

    private MovieRepository movieRepository;
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) {

        Category scifi = new Category("Sci-Fi");
        Category drama = new Category("Drama");
        Category comedy = new Category("Comedy");
        Category crime = new Category("Crime");
        Category adventure = new Category("Adventure");
        Category fantasy = new Category("Fantasy");
        Category action = new Category("Action");
        Category thriller = new Category("Thriller");
        Category romance = new Category("Romance");
        Category documentary = new Category("Documentary");
        Category horror = new Category("Horror");
        Category western = new Category("Western");
        Category mystery = new Category("Mystery");

        categoryRepository.save(scifi);
        categoryRepository.save(drama);
        categoryRepository.save(comedy);
        categoryRepository.save(crime);
        categoryRepository.save(adventure);
        categoryRepository.save(fantasy);
        categoryRepository.save(action);
        categoryRepository.save(thriller);
        categoryRepository.save(romance);
        categoryRepository.save(documentary);
        categoryRepository.save(horror);
        categoryRepository.save(western);
        categoryRepository.save(mystery);

        Movie matrix = Movie.builder().id(603L).title("The Matrix").category(scifi).year(1999).rating(8.7).description(
                "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in" +
                        " the war against its controllers.").build();

        Movie room = Movie.builder().id(17473L).title("The Room").category(drama).year(2003).rating(3.7).description(
                "Johnny is a successful bank executive who lives quietly in a San Francisco townhouse with his future" +
                        " wife, Lisa. One day, putting aside any scruple, she seduces Johnny's best friend, Mark. " +
                        "From there, nothing will be the same again.").build();

        Movie superbad = Movie.builder().id(8363L).title("Superbad").category(comedy).year(2007).rating(7.6).description(
                "Two co-dependent high school seniors are forced to deal with separation anxiety after their plan to " +
                        "stage a booze-soaked party goes awry.").build();

        Movie spaceOdyssey = Movie.builder().id(62L).title("2001: A Space Odyssey").category(scifi).year(1968).rating(8.3)
                .description("After discovering a mysterious artifact buried beneath the Lunar surface, mankind sets " +
                        "off on a quest to find its origins with help from intelligent supercomputer H.A.L. 9000.").build();


        Movie lockstockandtwosmokingbarrels = Movie.builder().id(100L).title("Lock, Stock and Two Smoking Barrels")
                .category(comedy).year(1998).rating(8.1).description("A card shark and his unwillingly-enlisted " +
                        "friends need to make a lot of cash quick after losing a sketchy poker match. To do this they" +
                        " decide to pull a heist on a small-time gang who happen to be operating out of the flat next" +
                        " door.").build();

        Movie léontheprofessional = Movie.builder().id(101L).title("Léon: The Professional")
                .category(crime).year(1994).rating(8.3).description("Léon, the top hit man in New York, has earned a " +
                        "rep as an effective \"cleaner\". But when his next-door neighbors are wiped out by a " +
                        "loose-cannon DEA agent, he becomes the unwilling custodian of 12-year-old Mathilda. Before " +
                        "long, Mathilda's thoughts turn to revenge, and she considers following in Léon's footsteps.").build();

        Movie taxidriver = Movie.builder().id(103L).title("Taxi Driver")
                .category(crime).year(1976).rating(8.2).description("A mentally unstable Vietnam War veteran works as" +
                        " a night-time taxi driver in New York City where the perceived decadence and sleaze feed his" +
                        " urge for violent action, attempting to save a preadolescent prostitute in the process.").build();

        Movie backtothefuture = Movie.builder().id(105L).title("Back to the Future")
                .category(adventure).year(1985).rating(8.3).description("Eighties teenager Marty McFly is " +
                        "accidentally sent back in time to 1955, inadvertently disrupting his parents' first meeting " +
                        "and attracting his mother's romantic interest. Marty must repair the damage to history by " +
                        "rekindling his parents' romance and - with the help of his eccentric inventor friend Doc " +
                        "Brown - return to 1985.").build();

        Movie predator = Movie.builder().id(106L).title("Predator")
                .category(scifi).year(1987).rating(7.4).description("Dutch and his group of commandos are " +
                        "hired by the CIA to rescue downed airmen from guerillas in a Central American jungle. The " +
                        "mission goes well but as they return they find that something is hunting them. Nearly " +
                        "invisible, it blends in with the forest, taking trophies from the bodies of its victims as " +
                        "it goes along. Occasionally seeing through its eyes, the audience sees it is an intelligent " +
                        "alien hunter, hunting them for sport, killing them off one at a time.").build();

        Movie snatch = Movie.builder().id(107L).title("Snatch")
                .category(thriller).year(2000).rating(7.8).description("There are two overlapping stories. One is the" +
                        " search for a stolen diamond. The other is about a boxing promoter who’s having trouble with" +
                        " a psychotic gangster.").build();

        Movie scarface = Movie.builder().id(111L).title("Scarface")
                .category(action).year(1983).rating(8.1).description("After getting a green card in exchange for " +
                        "assassinating a Cuban government official, Tony Montana stakes a claim on the drug trade in " +
                        "Miami. Viciously murdering anyone who stands in his way, Tony eventually becomes the biggest" +
                        " drug lord in the state, controlling nearly all the cocaine that comes through Miami. But " +
                        "increased pressure from the police, wars with Colombian drug cartels and his own drug-fueled" +
                        " paranoia serve to fuel the flames of his eventual downfall.").build();

        Movie prettywoman = Movie.builder().id(114L).title("Pretty Woman")
                .category(romance).year(1990).rating(7.3).description("When a millionaire wheeler-dealer enters a " +
                        "business contract with a Hollywood hooker Vivian Ward, he loses his heart in the bargain.").build();

        Movie thebiglebowski = Movie.builder().id(115L).title("The Big Lebowski")
                .category(comedy).year(1998).rating(7.9).description("Jeffrey \"The Dude\" Lebowski, a Los Angeles " +
                        "slacker who only wants to bowl and drink White Russians, is mistaken for another Jeffrey " +
                        "Lebowski, a wheelchair-bound millionaire, and finds himself dragged into a strange series of" +
                        " events involving nihilists, adult film producers, ferrets, errant toes, and large sums of " +
                        "money.").build();

        Movie matchpoint = Movie.builder().id(116L).title("Match Point")
                .category(drama).year(2005).rating(7.4).description("Match Point is Woody Allen’s satire of the " +
                        "British High Society and the ambition of a young tennis instructor to enter into it. Yet " +
                        "when he must decide between two women - one assuring him his place in high society, and the " +
                        "other that would take him far from it - palms start to sweat and a dark psychological match " +
                        "in his head begins.").build();

        Movie theuntouchables = Movie.builder().id(117L).title("The Untouchables")
                .category(crime).year(1987).rating(7.8).description("Young Treasury Agent Elliot Ness arrives in " +
                        "Chicago and is determined to take down Al Capone, but it's not going to be easy because " +
                        "Capone has the police in his pocket. Ness meets Jimmy Malone, a veteran patrolman and " +
                        "probably the most honorable one on the force. He asks Malone to help him get Capone, but " +
                        "Malone warns him that if he goes after Capone, he is going to war.").build();

        Movie charlieandthechocolatefactory = Movie.builder().id(118L).title("Charlie and the Chocolate Factory")
                .category(adventure).year(2005).rating(7).description("A young boy wins a tour through the most " +
                        "magnificent chocolate factory in the world, led by the world's most unusual candy maker.").build();

        Movie thelordoftheringsthefellowshipofthering = Movie.builder().id(120L).title("The Lord of the Rings: The " +
                "Fellowship of the Ring")
                .category(adventure).year(2001).rating(8.3).description("Young hobbit Frodo Baggins, after inheriting" +
                        " a mysterious ring from his uncle Bilbo, must leave his home in order to keep it from " +
                        "falling into the hands of its evil creator. Along the way, a fellowship is formed to protect" +
                        " the ringbearer and make sure that the ring arrives at its final destination: Mt. Doom, the " +
                        "only place where it can be destroyed.").build();

        Movie thelordoftheringsthetwotowers = Movie.builder().id(121L).title("The Lord of the Rings: The Two Towers")
                .category(adventure).year(2002).rating(8.3).description("Frodo and Sam are trekking to Mordor to " +
                        "destroy the One Ring of Power while Gimli, Legolas and Aragorn search for the orc-captured " +
                        "Merry and Pippin. All along, nefarious wizard Saruman awaits the Fellowship members at the " +
                        "Orthanc Tower in Isengard.").build();

        Movie thelordoftheringsthereturnoftheking = Movie.builder().id(122L).title("The Lord of the Rings: The Return" +
                " of the King")
                .category(adventure).year(2003).rating(8.4).description("Aragorn is revealed as the heir to the " +
                        "ancient kings as he, Gandalf and the other members of the broken fellowship struggle to save" +
                        " Gondor from Sauron's forces. Meanwhile, Frodo and Sam take the ring closer to the heart of " +
                        "Mordor, the dark lord's realm.").build();

        Movie thelordoftherings = Movie.builder().id(123L).title("The Lord of the Rings")
                .category(adventure).year(1978).rating(6.5).description("The Fellowship of the Ring embark on a " +
                        "journey to destroy the One Ring and end Sauron's reign over Middle-earth.").build();

        Movie bezkońca = Movie.builder().id(124L).title("Bez końca")
                .category(drama).year(1985).rating(7.7).description("Taking place in a 1982 Poland a translator loses" +
                        " her husband and becomes a victim of her own sorrow. She looks to sex, to her son, to law, " +
                        "and to hypnotism when she has nothing else in this time of martial law when Solidarity was " +
                        "banned.").build();

        Movie gimmeshelter = Movie.builder().id(132L).title("Gimme Shelter")
                .category(documentary).year(1970).rating(7.6).description("The landmark documentary about the " +
                        "tragically ill-fated Rolling Stones free concert at Altamont Speedway on December 6, 1969. " +
                        "Only four months earlier, Woodstock defined the Love Generation; now it lay in ruins on a " +
                        "desolate racetrack six miles outside of San Francisco.").build();

        Movie primary = Movie.builder().id(133L).title("Primary")
                .category(documentary).year(1960).rating(6.7).description("Primary is a documentary film about the " +
                        "primary elections between John F. Kennedy and Hubert Humphrey in 1960. Primary is the first " +
                        "documentary to use light equipment in order to follow their subjects in a more intimate " +
                        "filmmaking style. This unconventional way of filming created a new look for documentary " +
                        "films where the camera’s lens was right in the middle of what ever drama was occuring.").build();

        Movie obrotherwhereartthou = Movie.builder().id(134L).title("O Brother, Where Art Thou?")
                .category(action).year(2000).rating(7.3).description("In the deep south during the 1930s, three " +
                        "escaped convicts search for hidden treasure while a relentless lawman pursues them. On their" +
                        " journey they come across many comical characters and incredible situations. Based upon " +
                        "Homer's 'Odyssey'.").build();

        Movie dontlookback = Movie.builder().id(135L).title("Dont Look Back")
                .category(documentary).year(1967).rating(7.6).description("In this wildly entertaining vision of one " +
                        "of the twentieth century’s greatest artists, Bob Dylan is surrounded by teen fans, gets into" +
                        " heated philosophical jousts with journalists, and kicks back with fellow musicians Joan " +
                        "Baez, Donovan, and Alan Price.").build();

        Movie freaks = Movie.builder().id(136L).title("Freaks")
                .category(drama).year(1932).rating(7.8).description("A circus' beautiful trapeze artist agrees to " +
                        "marry the leader of side-show performers, but his deformed friends discover she is only " +
                        "marrying him for his inheritance.").build();

        Movie groundhogday = Movie.builder().id(137L).title("Groundhog Day")
                .category(romance).year(1993).rating(7.5).description("A narcissistic T.V. weatherman, along with his" +
                        " attractive-but-distant producer and mawkish cameraman, is sent to report on Groundhog Day " +
                        "in the small town of Punxsutawney, where he finds himself repeating the same day over and " +
                        "over.").build();

        Movie dracula = Movie.builder().id(138L).title("Dracula")
                .category(horror).year(1931).rating(7.2).description("The one that started them all. A powerful and " +
                        "ruthless vampire named Count Dracula arrives in London to prey on young, socialite women. " +
                        "Standing in the vampire's way, is a group of concerned men and the enigmatic Dr. Abraham Van" +
                        " Helsing. The beginning of Universal Horror in the sound era.").build();

        Movie donniedarko = Movie.builder().id(141L).title("Donnie Darko")
                .category(fantasy).year(2001).rating(7.8).description("After narrowly escaping a bizarre accident, a " +
                        "troubled teenager is plagued by visions of a large bunny rabbit that manipulates him to " +
                        "commit a series of crimes.").build();

        Movie brokebackmountain = Movie.builder().id(142L).title("Brokeback Mountain")
                .category(drama).year(2005).rating(7.8).description("Two modern-day cowboys meet on a shepherding job" +
                        " in the summer of '63, the two share a raw and powerful summer together that turns into a " +
                        "lifelong relationship conflicting with the lives they are supposed to live.").build();

        Movie breakingthewaves = Movie.builder().id(145L).title("Breaking the Waves")
                .category(drama).year(1996).rating(7.4).description("In a small and conservative Scottish village, a " +
                        "woman's paralytic husband convinces her to have extramarital intercourse so she can tell him" +
                        " about it and give him a reason for living.").build();

        Movie lesquatrecentscoups = Movie.builder().id(147L).title("Les Quatre Cents Coups")
                .category(drama).year(1959).rating(8.1).description("For young Parisian boy Antoine Doinel, life is " +
                        "one difficult situation after another. Surrounded by inconsiderate adults, including his " +
                        "neglectful parents, Antoine spends his days with his best friend, Rene, trying to plan for a" +
                        " better life. When one of their schemes goes awry, Antoine ends up in trouble with the law, " +
                        "leading to even more conflicts with unsympathetic authority figures.").build();

        Movie thesecretlifeofwords = Movie.builder().id(148L).title("The Secret Life of Words")
                .category(drama).year(2005).rating(7.1).description("A touching story of a deaf girl who is sent to " +
                        "an oil rig to take care of a man who has been blinded in a terrible accident. The girl has a" +
                        " special ability to communicate with the men on board and especially with her patient as " +
                        "they share intimate moments together that will change their lives forever.").build();

        Movie fortyeighthrs = Movie.builder().id(150L).title("48 Hrs.")
                .category(thriller).year(1982).rating(6.6).description("A hard-nosed cop reluctantly teams up with a " +
                        "wise-cracking criminal temporarily paroled to him, in order to track down a killer.").build();

        Movie startrekthemotionpicture = Movie.builder().id(152L).title("Star Trek: The Motion Picture")
                .category(scifi).year(1979).rating(6.4).description("When a destructive space entity is " +
                        "spotted approaching Earth, Admiral Kirk resumes command of the Starship Enterprise in order " +
                        "to intercept, examine, and hopefully stop it.").build();

        Movie startrekiithewrathofkhan = Movie.builder().id(154L).title("Star Trek II: The Wrath of Khan")
                .category(action).year(1982).rating(7.5).description("Admiral James T. Kirk is feeling old; the " +
                        "prospect of accompanying his old ship the Enterprise on a two week cadet cruise is not " +
                        "making him feel any younger. But the training cruise becomes a life or death struggle when " +
                        "Khan escapes from years of exile and captures the power of creation itself.").build();

        Movie thedarkknight = Movie.builder().id(155L).title("The Dark Knight")
                .category(drama).year(2008).rating(8.4).description("Batman raises the stakes in his war on crime. " +
                        "With the help of Lt. Jim Gordon and District Attorney Harvey Dent, Batman sets out to " +
                        "dismantle the remaining criminal organizations that plague the streets. The partnership " +
                        "proves to be effective, but they soon find themselves prey to a reign of chaos unleashed by " +
                        "a rising criminal mastermind known to the terrified citizens of Gotham as the Joker.").build();

        Movie startrekiiithesearchforspock = Movie.builder().id(157L).title("Star Trek III: The Search for Spock")
                .category(scifi).year(1984).rating(6.6).description("Admiral Kirk and his bridge crew risk " +
                        "their careers stealing the decommissioned Enterprise to return to the restricted Genesis " +
                        "planet to recover Spock's body.").build();

        Movie edwardscissorhands = Movie.builder().id(162L).title("Edward Scissorhands")
                .category(fantasy).year(1990).rating(7.7).description("A small suburban town receives a visit from a " +
                        "castaway unfinished science experiment named Edward.").build();

        Movie breakfastattiffanys = Movie.builder().id(164L).title("Breakfast at Tiffany's")
                .category(comedy).year(1961).rating(7.8).description("Fortune hunter Holly Golightly finds herself " +
                        "captivated by aspiring writer Paul Varjak, who's moved into her building on a wealthy " +
                        "woman's dime. As romance blooms between Paul and Holly, Doc Golightly shows up on the scene," +
                        " revealing Holly's past.").build();

        Movie backtothefuturepartii = Movie.builder().id(165L).title("Back to the Future Part II")
                .category(adventure).year(1989).rating(7.7).description("Marty and Doc are at it again in this wacky " +
                        "sequel to the 1985 blockbuster as the time-traveling duo head to 2015 to nip some McFly " +
                        "family woes in the bud. But things go awry thanks to bully Biff Tannen and a pesky sports " +
                        "almanac. In a last-ditch attempt to set things straight, Marty finds himself bound for 1955 " +
                        "and face to face with his teenage parents -- again.").build();

        Movie kpax = Movie.builder().id(167L).title("K-PAX")
                .category(drama).year(2001).rating(7.2).description("Prot is a patient at a mental hospital who " +
                        "claims to be from a far away Planet. His psychiatrist tries to help him, only to begin to " +
                        "doubt his own explanations.").build();

        Movie startrekivthevoyagehome = Movie.builder().id(168L).title("Star Trek IV: The Voyage Home")
                .category(scifi).year(1986).rating(7.2).description("Fugitives of the Federation for their " +
                        "daring rescue of Spock from the doomed Genesis Planet, Admiral Kirk (William Shatner) and " +
                        "his crew begin their journey home to face justice for their actions. But as they near Earth," +
                        " they find it at the mercy of a mysterious alien presence whose signals are slowly " +
                        "destroying the planet. In a desperate attempt to answer the call of the probe, Kirk and his " +
                        "crew race back to the late twentieth century. However they soon find the world they once " +
                        "knew to be more alien than anything they've encountered in the far reaches of the galaxy!").build();

        Movie predator2 = Movie.builder().id(169L).title("Predator 2")
                .category(scifi).year(1990).rating(6.1).description("Ten years after a band of mercenaries " +
                        "first battled a vicious alien, the invisible creature from another world has returned to " +
                        "Earth—and this time, it’s drawn to the gang-ruled and ravaged city of Los Angeles. When it " +
                        "starts murdering drug dealers, detective-lieutenant Mike Harrigan and his police force set " +
                        "out to capture the creature, ignoring warnings from a mysterious government agent to stay " +
                        "away.").build();

        Movie startrekvthefinalfrontier = Movie.builder().id(172L).title("Star Trek V: The Final Frontier")
                .category(scifi).year(1989).rating(5.7).description("Capt. Kirk and his crew must deal with" +
                        " Mr. Spock's half brother who kidnaps three diplomats and hijacks the Enterprise in his " +
                        "obsessive search for God.").build();

        Movie twentythousandlaguesunderthesea = Movie.builder().id(173L).title("20,000 Leagues Under the Sea")
                .category(adventure).year(1954).rating(7).description("A ship sent to investigate a wave of " +
                        "mysterious sinkings encounters the advanced submarine, the Nautilus, commanded by Captain " +
                        "Nemo.").build();

        Movie startrekvitheundiscoveredcountry = Movie.builder().id(174L).title("Star Trek VI: The Undiscovered " +
                "Country")
                .category(scifi).year(1991).rating(7).description("On the eve of retirement, Kirk and McCoy" +
                        " are charged with assassinating the Klingon High Chancellor and imprisoned. The Enterprise " +
                        "crew must help them escape to thwart a conspiracy aimed at sabotaging the last best hope for" +
                        " peace.").build();

        Movie legrandbleu = Movie.builder().id(175L).title("Le Grand Bleu")
                .category(adventure).year(1988).rating(7.6).description("Two men answer the call of the ocean in this" +
                        " romantic fantasy-adventure. Jacques and Enzo are a pair of friends who have been close " +
                        "since childhood, and who share a passion for the dangerous sport of free diving. " +
                        "Professional diver Jacques opted to follow in the footsteps of his father, who died at sea " +
                        "when Jacques was a boy; to the bewilderment of scientists, Jacques harbors a remarkable " +
                        "ability to adjust his heart rate and breathing pattern in the water, so that his vital signs" +
                        " more closely resemble that of dolphins than men (he even considers a school of dolphins as " +
                        "his extended family). As Enzo persuades a reluctant Jacques to compete against him in a free" +
                        " diving contest -- determining who can dive deeper and longer without scuba gear -- Jacques " +
                        "meets Johana, a beautiful insurance investigator from America, and he finds that he must " +
                        "choose between his love for her and his love of the sea.").build();

        Movie saw = Movie.builder().id(176L).title("Saw")
                .category(horror).year(2004).rating(7.4).description("Obsessed with teaching his victims the value of" +
                        " life, a deranged, sadistic serial killer abducts the morally wayward. Once captured, they " +
                        "must face impossible choices in a horrific game of survival. The victims must fight to win " +
                        "their lives back, or die trying...").build();

        Movie thefisherking = Movie.builder().id(177L).title("The Fisher King")
                .category(comedy).year(1991).rating(7.3).description("Two troubled men face their terrible destinies " +
                        "and events of their past as they join together on a mission to find the Holy Grail and thus " +
                        "to save themselves.").build();

        Movie blownaway = Movie.builder().id(178L).title("Blown Away")
                .category(thriller).year(1994).rating(6.2).description("Blown Away tells the story of Jimmy Dove who " +
                        "works for the Boston bomb squad. Shortly after Dove leaves the force his partner is killed " +
                        "by a bomb that Dove thinks might have been made by someone he knows.").build();

        Movie minorityreport = Movie.builder().id(180L).title("Minority Report")
                .category(action).year(2002).rating(7.3).description("John Anderton is a top 'Precrime' cop in the " +
                        "late-21st century, when technology can predict crimes before they're committed. But Anderton" +
                        " becomes the quarry when another investigator targets him for a murder charge.").build();

        Movie thewizard = Movie.builder().id(183L).title("The Wizard")
                .category(adventure).year(1989).rating(6.1).description("Corey refuses to let his emotionally " +
                        "disturbed younger brother Jimmy be institutionalized, and the two run away together. They " +
                        "soon join forces with a resourceful girl, who notices that Jimmy has a special talent: he is" +
                        " a \"wizard\" at video games and can achieve the high score on absolutely everything he " +
                        "plays." +
                        " Evading their parents and a sinister bounty hunter, the trio head for a climactic showdown " +
                        "at the national video game championships in California.").build();

        Movie jackiebrown = Movie.builder().id(184L).title("Jackie Brown")
                .category(crime).year(1997).rating(7.3).description("Jackie Brown is a flight attendant who gets " +
                        "caught in the middle of smuggling cash into the country for her gunrunner boss. When the " +
                        "cops try to use Jackie to get to her boss, she hatches a plan — with help from a bail " +
                        "bondsman — to keep the money for herself.").build();

        Movie aclockworkorange = Movie.builder().id(185L).title("A Clockwork Orange")
                .category(scifi).year(1971).rating(8.2).description("In a near-future Britain, young " +
                        "Alexander DeLarge and his pals get their kicks beating and raping anyone they please. When " +
                        "not destroying the lives of others, Alex swoons to the music of Beethoven. The state, eager " +
                        "to crack down on juvenile crime, gives an incarcerated Alex the option to undergo an " +
                        "invasive procedure that'll rob him of all personal agency. In a time when conscience is a " +
                        "commodity, can Alex change his tune?").build();

        Movie luckynumberslevin = Movie.builder().id(186L).title("Lucky Number Slevin")
                .category(drama).year(2006).rating(7.5).description("Slevin is mistakenly put in the middle of a " +
                        "personal war between the city’s biggest criminal bosses. Under constant watch, Slevin must " +
                        "try not to get killed by an infamous assassin and come up with an idea of how to get out of " +
                        "his current dilemma. A film with many twists and turns.").build();

        Movie sincity = Movie.builder().id(187L).title("Sin City")
                .category(action).year(2005).rating(7.4).description("Welcome to Sin City. This town beckons to the " +
                        "tough, the corrupt, the brokenhearted. Some call it dark… Hard-boiled. Then there are those " +
                        "who call it home — Crooked cops, sexy dames, desperate vigilantes. Some are seeking revenge," +
                        " others lust after redemption, and then there are those hoping for a little of both. A " +
                        "universe of unlikely and reluctant heroes still trying to do the right thing in a city that " +
                        "refuses to care.").build();

        Movie sincityadametokillfor = Movie.builder().id(189L).title("Sin City: A Dame to Kill For")
                .category(crime).year(2014).rating(6.3).description("Some of Sin City's most hard-boiled citizens " +
                        "cross paths with a few of its more reviled inhabitants.").build();

        Movie thenameoftherose = Movie.builder().id(192L).title("The Name of the Rose")
                .category(drama).year(1986).rating(7.4).description("14th-century Franciscan monk William of " +
                        "Baskerville and his young novice arrive at a conference to find that several monks have been" +
                        " murdered under mysterious circumstances. To solve the crimes, William must rise up against " +
                        "the Church's authority and fight the shadowy conspiracy of monastery monks using only his " +
                        "intelligence – which is considerable.").build();

        Movie startrekgenerations = Movie.builder().id(193L).title("Star Trek: Generations")
                .category(scifi).year(1994).rating(6.5).description("Captain Jean-Luc Picard and the crew " +
                        "of the Enterprise-D find themselves at odds with the renegade scientist Soran who is " +
                        "destroying entire star systems. Only one man can help Picard stop Soran's scheme...and he's " +
                        "been dead for seventy-eight years.").build();

        Movie troubleinparadise = Movie.builder().id(195L).title("Trouble in Paradise")
                .category(comedy).year(1932).rating(7.7).description("Thief Gaston Monescu and pickpocket Lily are " +
                        "partners in crime and love. Working for perfume company executive Mariette Colet, the two " +
                        "crooks decide to combine their criminal talents to rob their employer. Under the alias of " +
                        "Monsieur Laval, Gaston uses his position as Mariette's personal secretary to become closer " +
                        "to her. However, he takes things too far when he actually falls in love with Mariette, and " +
                        "has to choose between her and Lily.").build();

        Movie backtothefuturepartiii = Movie.builder().id(196L).title("Back to the Future Part III")
                .category(adventure).year(1990).rating(7.4).description("The final installment of the Back to the " +
                        "Future trilogy finds Marty digging the trusty DeLorean out of a mineshaft and looking for " +
                        "Doc in the Wild West of 1885. But when their time machine breaks down, the travelers are " +
                        "stranded in a land of spurs. More problems arise when Doc falls for pretty schoolteacher " +
                        "Clara Clayton, and Marty tangles with Buford Tannen.").build();

        Movie braveheart = Movie.builder().id(197L).title("Braveheart")
                .category(action).year(1995).rating(7.9).description("Enraged at the slaughter of Murron, his new " +
                        "bride and childhood love, Scottish warrior William Wallace slays a platoon of the local " +
                        "English lord's soldiers. This leads the village to revolt and, eventually, the entire " +
                        "country to rise up against English rule.").build();

        Movie tobeornottobe = Movie.builder().id(198L).title("To Be or Not to Be")
                .category(comedy).year(1942).rating(7.9).description("During the Nazi occupation of Poland, an acting" +
                        " troupe becomes embroiled in a Polish soldier's efforts to track down a German spy.").build();

        Movie startrekfirstcontact = Movie.builder().id(199L).title("Star Trek: First Contact")
                .category(scifi).year(1996).rating(7.3).description("The Borg, a relentless race of " +
                        "cyborgs, are on a direct course for Earth. Violating orders to stay away from the battle, " +
                        "Captain Picard and the crew of the newly-commissioned USS Enterprise E pursue the Borg back " +
                        "in time to prevent the invaders from changing Federation history and assimilating the galaxy" +
                        ".").build();

        Movie startrekinsurrection = Movie.builder().id(200L).title("Star Trek: Insurrection")
                .category(scifi).year(1998).rating(6.4).description("When an alien race and factions within" +
                        " Starfleet attempt to take over a planet that has \"regenerative\" properties, it falls upon" +
                        " " +
                        "Captain Picard and the crew of the Enterprise to defend the planet's people as well as the " +
                        "very ideals upon which the Federation itself was founded.").build();

        Movie startreknemesis = Movie.builder().id(201L).title("Star Trek: Nemesis")
                .category(scifi).year(2002).rating(6.2).description("En route to the honeymoon of William " +
                        "Riker to Deanna Troi on her home planet of Betazed, Captain Jean-Luc Picard and the crew of " +
                        "the U.S.S. Enterprise receives word from Starfleet that a coup has resulted in the " +
                        "installation of a new Romulan political leader, Shinzon, who claims to seek peace with the " +
                        "human-backed United Federation of Planets. Once in enemy territory, the captain and his crew" +
                        " make a startling discovery: Shinzon is human, a slave from the Romulan sister planet of " +
                        "Remus, and has a secret, shocking relationship to Picard himself.").build();

        Movie meanstreets = Movie.builder().id(203L).title("Mean Streets")
                .category(drama).year(1973).rating(7.2).description("A small-time hood must choose from among love, " +
                        "friendship and the chance to rise within the mob.").build();

        Movie hotelrwanda = Movie.builder().id(205L).title("Hotel Rwanda")
                .category(drama).year(2004).rating(7.7).description("Inspired by true events, this film takes place " +
                        "in Rwanda in the 1990s when more than a million Tutsis were killed in a genocide that went " +
                        "mostly unnoticed by the rest of the world. Hotel owner Paul Rusesabagina houses over a " +
                        "thousand refuges in his hotel in attempt to save their lives.").build();

        Movie paradisefound = Movie.builder().id(206L).title("Paradise Found")
                .category(drama).year(2003).rating(6.6).description("Paradise Found is a biography about the painter " +
                        "Paul Gauguin. Focusing on his personal conflict between citizen life and his family life and" +
                        " the art scene in Frane. In an incredible imagery montage Gauguin manages to make a " +
                        "successful living in the South Pacific, while being in opposition to France.").build();

        Movie deadpoetssociety = Movie.builder().id(207L).title("Dead Poets Society")
                .category(drama).year(1989).rating(8.3).description("At an elite, old-fashioned boarding school in " +
                        "New England, a passionate English teacher inspires his students to rebel against convention " +
                        "and seize the potential of every day, courting the disdain of the stern headmaster.").build();

        Movie arsenicandoldlace = Movie.builder().id(212L).title("Arsenic and Old Lace")
                .category(comedy).year(1944).rating(7.6).description("Mortimer Brewster, a newspaper drama critic, " +
                        "playwright and author known for his diatribes against marriage, suddenly falls in love and " +
                        "gets married; but when he makes a quick trip home to tell his two maiden aunts, he finds out" +
                        " his aunts' hobby - killing lonely old men and burying them in the cellar!").build();

        Movie northbynorthwest = Movie.builder().id(213L).title("North by Northwest")
                .category(mystery).year(1959).rating(8).description("Advertising man Roger Thornhill is mistaken for " +
                        "a spy, triggering a deadly cross-country chase.").build();

        Movie sawiii = Movie.builder().id(214L).title("Saw III")
                .category(horror).year(2006).rating(6.4).description("Jigsaw has disappeared. Along with his new " +
                        "apprentice Amanda, the puppet-master behind the cruel, intricate games that have terrified a" +
                        " community and baffled police has once again eluded capture and vanished. While city " +
                        "detective scramble to locate him, Doctor Lynn Denlon and Jeff Reinhart are unaware that they" +
                        " are about to become the latest pawns on his vicious chessboard.").build();

        Movie sawii = Movie.builder().id(215L).title("Saw II")
                .category(horror).year(2005).rating(6.5).description("When a new murder victim is discovered with all" +
                        " the signs of Jigsaw's hand, Detective Eric Matthews begins a full investigation and " +
                        "apprehends Jigsaw with little effort. But for Jigsaw, getting caught is just another part of" +
                        " his plan. Eight more of his victims are already fighting for their lives and now it's time " +
                        "for Matthews to join the game.").build();

        Movie theterminator = Movie.builder().id(218L).title("The Terminator")
                .category(action).year(1984).rating(7.5).description("In the post-apocalyptic future, reigning " +
                        "tyrannical supercomputers teleport a cyborg assassin known as the \"Terminator\" back to " +
                        "1984 " +
                        "to kill Sarah Connor, whose unborn son is destined to lead insurgents against 21st century " +
                        "mechanical hegemony. Meanwhile, the human-resistance movement dispatches a lone warrior to " +
                        "safeguard Sarah. Can he stop the virtually indestructible killing machine?").build();

        Movie eastofeden = Movie.builder().id(220L).title("East of Eden")
                .category(drama).year(1955).rating(7.7).description("In the Salinas Valley, in and around World War " +
                        "I, Cal Trask feels he must compete against overwhelming odds with his brother for the love " +
                        "of their father. Cal is frustrated at every turn, from his reaction to the war, to how to " +
                        "get ahead in business and in life, to how to relate to estranged mother.").build();

        Movie rebelwithoutacause = Movie.builder().id(221L).title("Rebel Without a Cause")
                .category(drama).year(1955).rating(7.7).description("After moving to a new town, troublemaking teen " +
                        "Jim Stark is supposed to have a clean slate, although being the new kid in town brings its " +
                        "own problems. While searching for some stability, Stark forms a bond with a disturbed " +
                        "classmate, Plato, and falls for local girl Judy. However, Judy is the girlfriend of " +
                        "neighborhood tough, Buzz. When Buzz violently confronts Jim and challenges him to a drag " +
                        "race, the new kid's real troubles begin.").build();

        Movie rebecca = Movie.builder().id(223L).title("Rebecca")
                .category(drama).year(1940).rating(8).description("Story of a young woman who marries a fascinating " +
                        "widower only to find out that she must live in the shadow of his former wife, Rebecca, who " +
                        "died mysteriously several years earlier. The young wife must come to grips with the terrible" +
                        " secret of her handsome, cold husband, Max De Winter. She must also deal with the jealous, " +
                        "obsessed Mrs. Danvers, the housekeeper, who will not accept her as the mistress of the house" +
                        ".").build();

        Movie boysdontcry = Movie.builder().id(226L).title("Boys Don't Cry")
                .category(crime).year(1999).rating(7.5).description("Female born, Teena Brandon adopts his male " +
                        "identity of Brandon Teena and attempts to find himself and love in Nebraska.").build();

        Movie theoutsiders = Movie.builder().id(227L).title("The Outsiders")
                .category(crime).year(1983).rating(7.3).description("When two poor greasers, Johnny, and Ponyboy are " +
                        "assaulted by a vicious gang, the socs, and Johnny kills one of the attackers, tension begins" +
                        " to mount between the two rival gangs, setting off a turbulent chain of events.").build();

        Movie thebrideoffrankenstein = Movie.builder().id(229L).title("The Bride of Frankenstein")
                .category(horror).year(1935).rating(7.6).description("Bride of Frankenstein begins where James " +
                        "Whale's Frankenstein from 1931 ended. Dr. Frankenstein has not been killed as previously " +
                        "portrayed and now he wants to get away from the mad experiments. Yet when his wife is " +
                        "kidnapped by his creation, Frankenstein agrees to help him create a new monster, this time a" +
                        " woman.").build();

        Movie rumblefish = Movie.builder().id(232L).title("Rumble Fish")
                .category(action).year(1983).rating(7.2).description("Rusty James, an absent-minded street thug " +
                        "struggles to live up to his legendary older brother's reputation, and longs for the days " +
                        "when gang warfare was going on.").build();

        Movie thewanderers = Movie.builder().id(233L).title("The Wanderers")
                .category(drama).year(1979).rating(7.4).description("The streets of the Bronx are owned by '60s youth" +
                        " gangs where the joy and pain of adolescence is lived. Philip Kaufman tells his take on the " +
                        "novel by Richard Price about the history of the Italian-American gang ‘The Wanderers.’").build();

        Movie standbyme = Movie.builder().id(235L).title("Stand by Me")
                .category(crime).year(1986).rating(7.9).description("After learning that a stranger has been " +
                        "accidentally killed near their rural homes, four Oregon boys decide to go see the body. On " +
                        "the way, Gordie Lachance, Vern Tessio, Chris Chambers and Teddy Duchamp encounter a mean " +
                        "junk man and a marsh full of leeches, as they also learn more about one another and their " +
                        "very different home lives. Just a lark at first, the boys' adventure evolves into a defining" +
                        " event in their lives.").build();

        Movie murielswedding = Movie.builder().id(236L).title("Muriel's Wedding")
                .category(drama).year(1994).rating(7).description("A young social outcast in Australia steals money " +
                        "from her parents to finance a vacation where she hopes to find happiness, and perhaps love.").build();

        Movie youngadam = Movie.builder().id(237L).title("Young Adam")
                .category(drama).year(2003).rating(6).description("A young drifter working on a river barge disrupts " +
                        "his employers' lives while hiding the fact that he knows more about a dead woman found in " +
                        "the river than he admits.").build();

        Movie thegodfather = Movie.builder().id(238L).title("The Godfather")
                .category(drama).year(1972).rating(8.7).description("Spanning the years 1945 to 1955, a chronicle of " +
                        "the fictional Italian-American Corleone crime family. When organized crime family patriarch," +
                        " Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to" +
                        " take care of the would-be killers, launching a campaign of bloody revenge.").build();

        Movie somelikeithot = Movie.builder().id(239L).title("Some Like It Hot")
                .category(comedy).year(1959).rating(8.2).description("Two musicians witness a mob hit and struggle to" +
                        " find a way out of the city before they are found by the gangsters. Their only opportunity " +
                        "is to join an all-girl band as they leave on a tour. To make their getaway they must first " +
                        "disguise themselves as women, then keep their identities secret and deal with the problems " +
                        "this brings - such as an attractive bandmate and a very determined suitor.").build();

        Movie thegodfatherpartii = Movie.builder().id(240L).title("The Godfather: Part II")
                .category(drama).year(1974).rating(8.5).description("In the continuing saga of the Corleone crime " +
                        "family, a young Vito Corleone grows up in Sicily and in 1910s New York. In the 1950s, " +
                        "Michael Corleone attempts to expand the family business into Las Vegas, Hollywood and Cuba.").build();

        Movie naturalbornkillers = Movie.builder().id(241L).title("Natural Born Killers")
                .category(crime).year(1994).rating(7.1).description("Two victims of traumatized childhoods become " +
                        "lovers and psychopathic serial murderers irresponsibly glorified by the mass media.").build();

        Movie thegodfatherpartiii = Movie.builder().id(242L).title("The Godfather: Part III")
                .category(crime).year(1990).rating(7.4).description("In the midst of trying to legitimize his " +
                        "business dealings in 1979 New York and Italy, aging mafia don, Michael Corleone seeks " +
                        "forgiveness for his sins while taking a young protege under his wing.").build();

        Movie kingkong = Movie.builder().id(244L).title("King Kong")
                .category(adventure).year(1933).rating(7.6).description("A film crew discovers the \"eighth wonder of" +
                        " the world, \" a giant prehistoric ape, and brings him back to New York, where he wreaks " +
                        "havoc.").build();

        Movie aboutaboy = Movie.builder().id(245L).title("About a Boy")
                .category(drama).year(2002).rating(6.7).description("Will Freeman is a hip Londoner who one day " +
                        "realizes that his friends are all involved with the responsibilities of married life, which " +
                        "leaves him alone in the cold. Passing himself off as a single father, he starts to meet a " +
                        "string of single mums, confident in his ability to leave them behind when they start to ask " +
                        "for a commitment. But Will's hope of continued bachelorhood is interrupted when he meets " +
                        "12-year old Marcus, in many ways his complete opposite.").build();

        Movie thekilling = Movie.builder().id(247L).title("The Killing")
                .category(crime).year(1956).rating(7.7).description("Career criminal Johnny Clay recruits a " +
                        "sharpshooter, a crooked police officer, a bartender and a betting teller named George, among" +
                        " others, for one last job before he goes straight and gets married. But when George tells " +
                        "his restless wife about the scheme to steal millions from the racetrack where he works, she " +
                        "hatches a plot of her own.").build();

        Movie pocketfulofmiracles = Movie.builder().id(248L).title("Pocketful of Miracles")
                .category(comedy).year(1961).rating(7.4).description("Damon Runyon's fairytale, sweet and funny, is " +
                        "told by director Frank Capra. Boozy, brassy Apple Annie, a beggar with a basket of apples, " +
                        "is as much as part of downtown New York as old Broadway itself. Bootlegger Dave the Dude is " +
                        "a sucker for her apples --- he thinks they bring him luck. But Dave and girlfriend Queenie " +
                        "Martin need a lot more than luck when it turns out that Annie is in a jam and only they can " +
                        "help: Annie's daughter Louise, who has lived all her life in a Spanish convent, is coming to" +
                        " America with a Count and his son. The count's son wants to marry Louise, who thinks her " +
                        "mother is part of New York society. It's up to Dave and Queenie and their Runyonesque " +
                        "cronies to turn Annie into a lady and convince the Count and his son that they are " +
                        "hobnobbing with New York's elite.").build();

        Movie thewaroftheroses = Movie.builder().id(249L).title("The War of the Roses")
                .category(comedy).year(1989).rating(6.9).description("The Roses, Barbara and Oliver, live happily as " +
                        "a married couple. Then she starts to wonder what life would be like without Oliver, and " +
                        "likes what she sees. Both want to stay in the house, and so they begin a campaign to force " +
                        "each other to leave. In the middle of the fighting is D'Amato, the divorce lawyer. He gets " +
                        "to see how far both will go to get rid of the other, and boy do they go far.").build();

        Movie ghost = Movie.builder().id(251L).title("Ghost")
                .category(fantasy).year(1990).rating(7.1).description("Sam Wheat is a banker, Molly Jensen is an " +
                        "artist, and the two are madly in love. However, when Sam is murdered by his friend and " +
                        "corrupt business partner Carl Bruner over a shady business deal, he is left to roam the " +
                        "earth as a powerless spirit. When he learns of Carl's betrayal, Sam must seek the help of " +
                        "psychic Oda Mae Brown to set things right and protect Molly from Carl and his goons.").build();

        Movie liveandletdie = Movie.builder().id(253L).title("Live and Let Die")
                .category(adventure).year(1973).rating(6.5).description("James Bond must investigate a mysterious " +
                        "murder case of a British agent in New Orleans. Soon he finds himself up against a gangster " +
                        "boss named Mr. Big.").build();

        Movie olivertwist = Movie.builder().id(257L).title("Oliver Twist")
                .category(crime).year(2005).rating(6.7).description("Oliver Twist the modern filmed version of " +
                        "Charles Dickens bestseller, a Roman Polanski adaptation. The classic Dickens tale, where an " +
                        "orphan meets a pickpocket on the streets of London. From there, he joins a household of boys" +
                        " who are trained to steal for their master.").build();

        Movie the39steps = Movie.builder().id(260L).title("The 39 Steps")
                .category(action).year(1935).rating(7.5).description("Richard Hannay stumbles upon a conspiracy that " +
                        "thrusts him into a hectic chase across the Scottish moors—a chase in which he is both the " +
                        "pursuer and the pursued—as well as into an unexpected romance with the cool Pamela.").build();

        Movie catonahottinroof = Movie.builder().id(261L).title("Cat on a Hot Tin Roof")
                .category(drama).year(1958).rating(7.8).description("An alcoholic ex-football player drinks his days " +
                        "away, having failed to come to terms with his sexuality and his real feelings for his " +
                        "football buddy who died after an ambiguous accident. His wife is crucified by her " +
                        "desperation to make him desire her: but he resists the affections of his wife. His reunion " +
                        "with his father—who is dying of cancer—jogs a host of memories and revelations for both " +
                        "father and son.").build();

        Movie thekingofcomedy = Movie.builder().id(262L).title("The King of Comedy")
                .category(comedy).year(1982).rating(7.7).description("Aspiring comic Rupert Pupkin attempts to " +
                        "achieve success in show business by stalking his idol, a late night talk-show host who " +
                        "craves his own privacy.").build();

        Movie lemépris = Movie.builder().id(266L).title("Le Mépris")
                .category(drama).year(1963).rating(7.4).description("A philistine in the art film business, Jeremy " +
                        "Prokosch is a producer unhappy with the work of his director. Prokosch has hired Fritz Lang " +
                        "(as himself) to direct an adaptation of \"The Odyssey, \" but when it seems that the legendary" +
                        " filmmaker is making a picture destined to bomb at the box office, he brings in a " +
                        "screenwriter to energize the script. The professional intersects with the personal when a " +
                        "rift develops between the writer and his wife.").build();

        Movie batman = Movie.builder().id(268L).title("Batman")
                .category(fantasy).year(1989).rating(7.2).description("The Dark Knight of Gotham City begins his war " +
                        "on crime with his first major enemy being the clownishly homicidal Joker, who has seized " +
                        "control of Gotham's underworld.").build();

        Movie batmanbegins = Movie.builder().id(272L).title("Batman Begins")
                .category(action).year(2005).rating(7.7).description("Driven by tragedy, billionaire Bruce Wayne " +
                        "dedicates his life to uncovering and defeating the corruption that plagues his home, Gotham " +
                        "City. Unable to work within the system, he instead creates a new identity, a symbol of fear " +
                        "for the criminal underworld - The Batman.").build();

        Movie thesilenceofthelambs = Movie.builder().id(274L).title("The Silence of the Lambs")
                .category(crime).year(1991).rating(8.3).description("Clarice Starling is a top student at the FBI's " +
                        "training academy. Jack Crawford wants Clarice to interview Dr. Hannibal Lecter, a brilliant " +
                        "psychiatrist who is also a violent psychopath, serving life behind bars for various acts of " +
                        "murder and cannibalism. Crawford believes that Lecter may have insight into a case and that " +
                        "Starling, as an attractive young woman, may be just the bait to draw him out.").build();

        Movie fargo = Movie.builder().id(275L).title("Fargo")
                .category(crime).year(1996).rating(7.9).description("Jerry, a small-town Minnesota car salesman is " +
                        "bursting at the seams with debt... but he's got a plan. He's going to hire two thugs to " +
                        "kidnap his wife in a scheme to collect a hefty ransom from his wealthy father-in-law. It's " +
                        "going to be a snap and nobody's going to get hurt... until people start dying. Enter Police " +
                        "Chief Marge, a coffee-drinking, parka-wearing - and extremely pregnant - investigator who'll" +
                        " stop at nothing to get her man. And if you think her small-time investigative skills will " +
                        "give the crooks a run for their ransom... you betcha!").build();

        Movie underworld = Movie.builder().id(277L).title("Underworld")
                .category(fantasy).year(2003).rating(6.7).description("Vampires and werewolves have waged a nocturnal" +
                        " war against each other for centuries. But all bets are off when a female vampire warrior " +
                        "named Selene, who's famous for her strength and werewolf-hunting prowess, becomes smitten " +
                        "with a peace-loving male werewolf, Michael, who wants to end the war.").build();

        Movie theshawshankredemption = Movie.builder().id(278L).title("The Shawshank Redemption")
                .category(drama).year(1994).rating(8.7).description("Framed in the 1940s for the double murder of his" +
                        " wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank " +
                        "prison, where he puts his accounting skills to work for an amoral warden. During his long " +
                        "stretch in prison, Dufresne comes to be admired by the other inmates -- including an older " +
                        "prisoner named Red -- for his integrity and unquenchable sense of hope.").build();

        Movie amadeus = Movie.builder().id(279L).title("Amadeus")
                .category(drama).year(1984).rating(8).description("The incredible story of genius musician Wolfgang " +
                        "Amadeus Mozart, told in flashback by his peer and secret rival, Antonio Salieri—now confined" +
                        " to an insane asylum.").build();

        Movie terminator2judgmentday = Movie.builder().id(280L).title("Terminator 2: Judgment Day")
                .category(action).year(1991).rating(8).description("Nearly 10 years have passed since Sarah Connor " +
                        "was targeted for termination by a cyborg from the future. Now her son, John, the future " +
                        "leader of the resistance, is the target for a newer, more deadly terminator. Once again, the" +
                        " resistance has managed to send a protector back to attempt to save John and his mother " +
                        "Sarah.").build();

        Movie strangedays = Movie.builder().id(281L).title("Strange Days")
                .category(crime).year(1995).rating(7).description("Set in the year 1999 during the last days of the " +
                        "old millennium, the movie tells the story of Lenny Nero, an ex-cop who now deals with " +
                        "data-discs containing recorded memories and emotions. One day he receives a disc which " +
                        "contains the memories of a murderer killing a prostitute. Lenny investigates and is pulled " +
                        "deeper and deeper in a whirl of blackmail, murder and rape. Will he survive and solve the " +
                        "case?").build();

        Movie theapartment = Movie.builder().id(284L).title("The Apartment")
                .category(comedy).year(1960).rating(8.2).description("Bud Baxter is a minor clerk in a huge New York " +
                        "insurance company, until he discovers a quick way to climb the corporate ladder. He lends " +
                        "out his apartment to the executives as a place to take their mistresses. Although he often " +
                        "has to deal with the aftermath of their visits, one night he's left with a major problem to " +
                        "solve.").build();

        Movie piratesofthecaribbeanatworldsend = Movie.builder().id(285L).title("Pirates of the Caribbean: At World's" +
                " End")
                .category(adventure).year(2007).rating(7.2).description("Captain Barbossa, long believed to be dead, " +
                        "has come back to life and is headed to the edge of the Earth with Will Turner and Elizabeth " +
                        "Swann. But nothing is quite as it seems.").build();

        Movie bulldurham = Movie.builder().id(287L).title("Bull Durham")
                .category(comedy).year(1988).rating(6.8).description("Veteran catcher Crash Davis is brought to the " +
                        "minor league Durham Bulls to help their up and coming pitching prospect, \"Nuke\" Laloosh. " +
                        "Their relationship gets off to a rocky start and is further complicated when baseball " +
                        "groupie Annie Savoy sets her sights on the two men.").build();

        Movie highnoon = Movie.builder().id(288L).title("High Noon")
                .category(western).year(1952).rating(7.7).description("Will Kane, the sheriff of a small town in New " +
                        "Mexico, learns a notorious outlaw he put in jail has been freed, and will be arriving on the" +
                        " noon train. Knowing the outlaw and his gang are coming to kill him, Kane is determined to " +
                        "stand his ground, so he gathers a posse from among the local townspeople.").build();

        Movie bartonfink = Movie.builder().id(290L).title("Barton Fink")
                .category(comedy).year(1991).rating(7.5).description("A renowned New York playwright is enticed to " +
                        "California to write for the movies and discovers the hellish truth of Hollywood.").build();

        Movie ridinggiants = Movie.builder().id(291L).title("Riding Giants")
                .category(documentary).year(2004).rating(8).description("Riding Giants is story about big wave " +
                        "surfers who have become heroes and legends in their sport. Directed by the skateboard guru " +
                        "Stacy Peralta.").build();

        Movie davechappellesblockparty = Movie.builder().id(292L).title("Dave Chappelle's Block Party")
                .category(comedy).year(2005).rating(6.9).description("The American comedian/actor delivers a story " +
                        "about the alternative Hip Hop scene. A small town Ohio man’s moves to Brooklyn, New York, to" +
                        " throw an unprecedented block party.").build();

        Movie ariverrunsthroughit = Movie.builder().id(293L).title("A River Runs Through It")
                .category(drama).year(1992).rating(7.1).description("A River Runs Through is a cinematographically " +
                        "stunning true story of Norman Maclean. The story follows Norman and his brother Paul through" +
                        " the experiences of life and growing up, and how their love of fly fishing keeps them " +
                        "together despite varying life circumstances in the untamed west of Montana in the 1920's.").build();

        Movie deserthearts = Movie.builder().id(294L).title("Desert Hearts")
                .category(drama).year(1985).rating(7.4).description("The story of straight-edge literature professor " +
                        "Vivian who travels to Reno to get away from a relationship breakup when she falls in love " +
                        "with an attractive and unconventional girl named Cay.").build();

        Movie terminator3riseofthemachines = Movie.builder().id(296L).title("Terminator 3: Rise of the Machines")
                .category(action).year(2003).rating(6).description("It's been 10 years since John Connor saved Earth " +
                        "from Judgment Day, and he's now living under the radar, steering clear of using anything " +
                        "Skynet can trace. That is, until he encounters T-X, a robotic assassin ordered to finish " +
                        "what T-1000 started. Good thing Connor's former nemesis, the Terminator, is back to aid the " +
                        "now-adult Connor … just like he promised.").build();

        Movie oceanseleven = Movie.builder().id(299L).title("Ocean's Eleven")
                .category(thriller).year(1960).rating(6.6).description("Ocean's 11 is the 'Rat-Pack' comedy about " +
                        "robber Danny Ocean and his gang's attempt to rob the five biggest casinos in Las Vegas.").build();

        movieRepository.save(matrix);
        movieRepository.save(room);
        movieRepository.save(superbad);
        movieRepository.save(spaceOdyssey);

        movieRepository.save(lockstockandtwosmokingbarrels);
        movieRepository.save(léontheprofessional);
        movieRepository.save(taxidriver);
        movieRepository.save(backtothefuture);
        movieRepository.save(predator);
        movieRepository.save(snatch);
        movieRepository.save(scarface);
        movieRepository.save(prettywoman);
        movieRepository.save(thebiglebowski);
        movieRepository.save(matchpoint);
        movieRepository.save(theuntouchables);
        movieRepository.save(charlieandthechocolatefactory);
        movieRepository.save(thelordoftheringsthefellowshipofthering);
        movieRepository.save(thelordoftheringsthetwotowers);
        movieRepository.save(thelordoftheringsthereturnoftheking);
        movieRepository.save(thelordoftherings);
        movieRepository.save(bezkońca);
        movieRepository.save(gimmeshelter);
        movieRepository.save(primary);
        movieRepository.save(obrotherwhereartthou);
        movieRepository.save(dontlookback);
        movieRepository.save(freaks);
        movieRepository.save(groundhogday);
        movieRepository.save(dracula);
        movieRepository.save(donniedarko);
        movieRepository.save(brokebackmountain);
        movieRepository.save(breakingthewaves);
        movieRepository.save(lesquatrecentscoups);
        movieRepository.save(thesecretlifeofwords);
        movieRepository.save(fortyeighthrs);
        movieRepository.save(startrekthemotionpicture);
        movieRepository.save(startrekiithewrathofkhan);
        movieRepository.save(thedarkknight);
        movieRepository.save(startrekiiithesearchforspock);
        movieRepository.save(edwardscissorhands);
        movieRepository.save(breakfastattiffanys);
        movieRepository.save(backtothefuturepartii);
        movieRepository.save(kpax);
        movieRepository.save(startrekivthevoyagehome);
        movieRepository.save(predator2);
        movieRepository.save(startrekvthefinalfrontier);
        movieRepository.save(twentythousandlaguesunderthesea);
        movieRepository.save(startrekvitheundiscoveredcountry);
        movieRepository.save(legrandbleu);
        movieRepository.save(saw);
        movieRepository.save(thefisherking);
        movieRepository.save(blownaway);
        movieRepository.save(minorityreport);
        movieRepository.save(thewizard);
        movieRepository.save(jackiebrown);
        movieRepository.save(aclockworkorange);
        movieRepository.save(luckynumberslevin);
        movieRepository.save(sincity);
        movieRepository.save(sincityadametokillfor);
        movieRepository.save(thenameoftherose);
        movieRepository.save(startrekgenerations);
        movieRepository.save(troubleinparadise);
        movieRepository.save(backtothefuturepartiii);
        movieRepository.save(braveheart);
        movieRepository.save(tobeornottobe);
        movieRepository.save(startrekfirstcontact);
        movieRepository.save(startrekinsurrection);
        movieRepository.save(startreknemesis);
        movieRepository.save(meanstreets);
        movieRepository.save(hotelrwanda);
        movieRepository.save(paradisefound);
        movieRepository.save(deadpoetssociety);
        movieRepository.save(arsenicandoldlace);
        movieRepository.save(northbynorthwest);
        movieRepository.save(sawiii);
        movieRepository.save(sawii);
        movieRepository.save(theterminator);
        movieRepository.save(eastofeden);
        movieRepository.save(rebelwithoutacause);
        movieRepository.save(rebecca);
        movieRepository.save(boysdontcry);
        movieRepository.save(theoutsiders);
        movieRepository.save(thebrideoffrankenstein);
        movieRepository.save(rumblefish);
        movieRepository.save(thewanderers);
        movieRepository.save(standbyme);
        movieRepository.save(murielswedding);
        movieRepository.save(youngadam);
        movieRepository.save(thegodfather);
        movieRepository.save(somelikeithot);
        movieRepository.save(thegodfatherpartii);
        movieRepository.save(naturalbornkillers);
        movieRepository.save(thegodfatherpartiii);
        movieRepository.save(kingkong);
        movieRepository.save(aboutaboy);
        movieRepository.save(thekilling);
        movieRepository.save(pocketfulofmiracles);
        movieRepository.save(thewaroftheroses);
        movieRepository.save(ghost);
        movieRepository.save(liveandletdie);
        movieRepository.save(kingkong);
        movieRepository.save(olivertwist);
        movieRepository.save(the39steps);
        movieRepository.save(catonahottinroof);
        movieRepository.save(thekingofcomedy);
        movieRepository.save(lemépris);
        movieRepository.save(batman);
        movieRepository.save(batmanbegins);
        movieRepository.save(thesilenceofthelambs);
        movieRepository.save(fargo);
        movieRepository.save(underworld);
        movieRepository.save(theshawshankredemption);
        movieRepository.save(amadeus);
        movieRepository.save(terminator2judgmentday);
        movieRepository.save(strangedays);
        movieRepository.save(theapartment);
        movieRepository.save(piratesofthecaribbeanatworldsend);
        movieRepository.save(bulldurham);
        movieRepository.save(highnoon);
        movieRepository.save(bartonfink);
        movieRepository.save(ridinggiants);
        movieRepository.save(davechappellesblockparty);
        movieRepository.save(ariverrunsthroughit);
        movieRepository.save(deserthearts);
        movieRepository.save(terminator3riseofthemachines);
        movieRepository.save(oceanseleven);
    }
}