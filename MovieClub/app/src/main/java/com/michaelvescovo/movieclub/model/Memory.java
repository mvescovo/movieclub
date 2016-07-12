package com.michaelvescovo.movieclub.model;

import com.michaelvescovo.movieclub.R;

import java.util.ArrayList;

/**
 * Created by michael on 17/08/15.
 * Data holder for assignment 1 to hold static movie information.
 * Uses singleton design pattern.
 */

public class Memory {
    private ArrayList<MovieImpl> movieArrayList = new ArrayList<>();
    private static final Memory DATA_HOLDER = new Memory();

    private Memory() {
        movieArrayList.add(new MovieImpl("0286716", R.drawable.tt0286716, "Hulk", "2003", "Bruce Banner, a genetics researcher with a tragic past, suffers an accident that causes him to transform into a raging green monster when he gets angry.", "Bruce Banner, a brilliant scientist with a cloudy past about his family, is involved in an accident in his laboratory causing him to become exposed to gamma radiation and Nanomeds (A tiny life-form that is supposed to heal wounds but has killed everything with which they have made contact). Confused and curious about his survival, Banner discovers that since the accident, whenever he becomes angry he transforms into a giant green monster destroying everything in sight in an act of fury. Bruce's mysterious past and the answer to why the radiation had this effect becomes revealed to him as his Birth Father David Banner intervenes with hopes to continue experimenting on him."));
        movieArrayList.add(new MovieImpl("0319343", R.drawable.tt0319343, "Elf", "2003", "After inadvertently wreaking havoc on the elf community due to his ungainly size, a man raised as an elf at the North Pole is sent to the U.S. in search of his true identity.", "Buddy was a baby in an orphanage who stowed away in Santa's sack and ended up at the North Pole. Later, as an adult human who happened to be raised by elves, Santa allows him to go to New York City to find his birth father, Walter Hobbs. Hobbs, on Santa's naughty list for being a heartless jerk, had no idea that Buddy was even born. Buddy, meanwhile, experiences the delights of New York City (and human culture) as only an elf can. When Walter's relationship with Buddy interferes with his job, he is forced to reevaluate his priorities."));
        movieArrayList.add(new MovieImpl("0371746", R.drawable.tt0371746, "Iron Man", "2008", "After being held captive in an Afghan cave, an industrialist creates a unique weaponized suit of armor to fight evil.", "Tony Stark. Genius, billionaire, playboy, philanthropist. Son of legendary inventor and weapons contractor Howard Stark. When Tony Stark is assigned to give a weapons presentation to an Iraqi unit led by Lt. Col. James Rhodes, he's given a ride on enemy lines. That ride ends badly when Stark's Humvee that he's riding in is attacked by enemy combatants. He survives - barely - with a chest full of shrapnel and a car battery attached to his heart. In order to survive he comes up with a way to miniaturize the battery and figures out that the battery can power something else. Thus Iron Man is born. He uses the primitive device to escape from the cave in Iraq. Once back home, he then begins work on perfecting the Iron Man suit. But the man who was put in charge of Stark Industries has plans of his own to take over Tony's technology for other matters."));
        movieArrayList.add(new MovieImpl("0420223", R.drawable.tt0420223, "Stranger Than Fiction", "2006", "An IRS auditor suddenly finds himself the subject of narration only he can hear: narration that begins to affect his entire life, from his work, to his love-interest, to his death.", "Everybody knows that your life is a story. But what if a story was your life? Harold Crick is your average IRS agent: monotonous, boring, and repetitive. But one day this all changes when Harold begins to hear an author inside his head narrating his life. The narrator it is extraordinarily accurate, and Harold recognizes the voice as an esteemed author he saw on TV. But when the narration reveals that he is going to die, Harold must find the author of the story, and ultimately his life, to convince her to change the ending of the story before it is too late."));
        movieArrayList.add(new MovieImpl("0457400", R.drawable.tt0457400, "Land of the Lost", "2009", "On his latest expedition, Dr. Rick Marshall is sucked into a space-time vortex alongside his research assistant and a redneck survivalist. In this alternate universe, the trio make friends with a primate named Chaka, their only ally in a world full of dinosaurs and other fantastic creatures.", "Palaeontologist Rick Marshall takes Will and Holly into a new world of danger, dinosaurs and big bug-eyed lizard people while trying to find their way back home and, too, save the universe and in doing so saving his reputation. With the dinosaur with brains, brawn and personality and the adventure of scientific advancement and exotic beasts in a far away land, it all adds up to time traveling fun and frolics."));
        movieArrayList.add(new MovieImpl("0470752", R.drawable.tt0470752, "Ex Machina", "2015", "A young programmer is selected to participate in a ground-breaking experiment in artificial intelligence by evaluating the human qualities of a breath-taking female A.I.", "Caleb, a 26 year old coder at the world's largest internet company, wins a competition to spend a week at a private mountain retreat belonging to Nathan, the reclusive CEO of the company. But when Caleb arrives at the remote location he finds that he will have to participate in a strange and fascinating experiment in which he must interact with the world's first true artificial intelligence, housed in the body of a beautiful robot girl."));
        movieArrayList.add(new MovieImpl("0838283", R.drawable.tt0838283, "Step Brothers", "2008", "Two aimless middle-aged losers still living at home are forced against their will to become room-mates when their parents marry.", "Brennan Huff and Dale Doback are both about 40 when Brennan's mom and Dale's dad marry. The sons still live with the parents so they must now share a room. Initial antipathy threatens the household's peace and the parents' relationship. Dad lays down the law: both slackers have a week to find a job. Out of the job search and their love of music comes a pact that leads to friendship but more domestic disarray compounded by the boys' sleepwalking. Hovering nearby are Brennan's successful brother and his lonely wife: the brother wants to help sell his step-father's house, the wife wants Dale's attention, and the newlyweds want to retire and sail the seven seas. Can harmony come from the discord?"));
        movieArrayList.add(new MovieImpl("1386588", R.drawable.tt1386588, "The Other Guys", "2010", "Two mismatched New York City detectives seize an opportunity to step up like the city's top cops whom they idolize -- only things don't quite go as planned.", "Terry Hoitz's past mistakes in the line of duty and Allen Gamble's reluctance to take risks have landed them the roles of the &quot;Other Guys&quot;, disgraced New York City police detectives relegated to filling out paperwork for cocky hero cops Danson and Highsmith. The mismatched duo must look past their differences when they take on a high-profile investigation of shady capitalist David Ershon and attempt to fill the shoes of the notoriously reckless officers they idolize."));
        movieArrayList.add(new MovieImpl("1637725", R.drawable.tt1637725, "Ted", "2012", "As the result of a childhood wish, John Bennett's teddy bear, Ted, came to life and has been by John's side ever since - a friendship that's tested when Lori, John's girlfriend of four years, wants more from their relationship.", "John makes a Christmas miracle happen by bringing his one and only friend to life, his teddy bear. The two grow up together and John must then choose to stay with his girlfriend or keep his friendship with his crude and extremely inappropriate teddy bear, Ted."));
        movieArrayList.add(new MovieImpl("1798709", R.drawable.tt1798709, "Her", "2013", "A lonely writer develops an unlikely relationship with his newly purchased operating system that's designed to meet his every need.", "Theodore is a lonely man in the final stages of his divorce. When he's not working as a letter writer, his down time is spent playing video games and occasionally hanging out with friends. He decides to purchase the new OS1, which is advertised as the world's first artificially intelligent operating system, &quot;It's not just an operating system, it's a consciousness,&quot; the ad states. Theodore quickly finds himself drawn in with Samantha, the voice behind his OS1. As they start spending time together they grow closer and closer and eventually find themselves in love. Having fallen in love with his OS, Theodore finds himself dealing with feelings of both great joy and doubt. As an OS, Samantha has powerful intelligence that she uses to help Theodore in ways others hadn't, but how does she help him deal with his inner conflict of being in love with an OS?"));
        movieArrayList.add(new MovieImpl("2015381", R.drawable.tt2015381, "Guardians of the Galaxy", "2014", "A group of intergalactic criminals are forced to work together to stop a fanatical warrior from taking control of the universe.", "After stealing a mysterious orb in the far reaches of outer space, Peter Quill from Earth, is now the main target of a manhunt led by the villain known as Ronan the Accuser. To help fight Ronan and his team and save the galaxy from his power, Quill creates a team of space heroes known as the &quot;Guardians of the Galaxy&quot; to save the world."));
        movieArrayList.add(new MovieImpl("2209764", R.drawable.tt2209764, "Transcendence", "2014", "A scientist's drive for artificial intelligence, takes on dangerous implications when his consciousness is uploaded into one such program.", "Dr. Will Caster (Johnny Depp) is the foremost researcher in the field of Artificial Intelligence, working to create a sentient machine that combines the collective intelligence of everything ever known with the full range of human emotions. His highly controversial experiments have made him famous, but they have also made him the prime target of anti-technology extremists who will do whatever it takes to stop him. However, in their attempt to destroy Will, they inadvertently become the catalyst for him to succeed-to be a participant in his own transcendence. For his wife Evelyn (Rebecca Hall) and best friend Max Waters (Paul Bettany), both fellow researchers, the question is not if they can...but if they should. Their worst fears are realized as Will's thirst for knowledge evolves into a seemingly omnipresent quest for power, to what end is unknown. The only thing that is becoming terrifyingly clear is there may be no way to stop him."));
    }

    public static Memory getDataHolder() {
        return DATA_HOLDER;
    }

    public ArrayList<MovieImpl> getMovieArrayList() {
        return movieArrayList;
    }
}