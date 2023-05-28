package com.example.universe

// Basis data Planet dan Galaxy
val listPlanet = listOf<UniverseModel>(
    UniverseModel(
        R.drawable.img_planet_earth,
        "Earth",
        "Our home planet is the third planet from the Sun, and the only place we know of so far that’s inhabited by living things.",
        "Our home planet is the third planet from the Sun, and the only place we know of so far that’s inhabited by living things.\n" +
                "\n" +
                "While Earth is only the fifth largest planet in the solar system, it is the only world in our solar system with liquid water on the surface. Just slightly larger than nearby Venus, Earth is the biggest of the four planets closest to the Sun, all of which are made of rock and metal.\n" +
                "\n" +
                "Earth is the only planet in the Solar System whose English name does not come from Greek or Roman mythology. The name was taken from Old English and Germanic. It simply means \"the ground.\" There are, of course, many names for our planet in the thousands of languages spoken by the people of the third planet from the Sun.",
        "Terrestrial","Gaia"
    ),
    UniverseModel(
        R.drawable.img_planet_mars,
        "Mars",
        "Mars is the fourth planet from the Sun – a dusty, cold, desert world with a very thin atmosphere.",
        "Mars is the fourth planet from the Sun – a dusty, cold, desert world with a very thin atmosphere. Mars is also a dynamic planet with seasons, polar ice caps, canyons, extinct volcanoes, and evidence that it was even more active in the past.\n" +
                "\n" +
                "Mars is one of the most explored bodies in our solar system, and it's the only planet where we've sent rovers to roam the alien landscape.\n" +
                "\n" +
                "NASA currently has two rovers (Curiosity and Perseverance), one lander (InSight), and one helicopter (Ingenuity) exploring the surface of Mars.\n" +
                "\n" +
                "Perseverance rover – the largest, most advanced rover NASA has sent to another world – touched down on Mars on Feb. 18, 2021, after a 203-day journey traversing 293 million miles (472 million kilometers). The Ingenuity helicopter rode to Mars attached to the belly of Perseverance.\n" +
                "\n" +
                "Perseverance is one of three spacecraft that arrived at Mars in 2021. The Hope orbiter from the United Arab Emirates arrived on Feb. 9, 2021. China’s Tianwen-1 mission arrived on Feb. 10, 2021, and includes an orbiter, a lander, and a rover. Europe and India also have spacecraft studying Mars from orbit.\n" +
                "\n" +
                "In May 2021, China became the second nation to ever land successfully on Mars when its Zhurong Mars rover touched down.\n" +
                "\n" +
                "An international fleet of eight orbiters is studying the Red Planet from above including three NASA orbiters: 2001 Mars Odyssey, Mars Reconnaissance Orbiter, and MAVEN.\n" +
                "\n" +
                "These robotic explorers have found lots of evidence that Mars was much wetter and warmer, with a thicker atmosphere, billions of years ago.",
        "Terrestrial","Mavors"
    ),
    UniverseModel(
        R.drawable.img_planet_jupiter,
        "Jupiter",
        "Jupiter has a long history of surprising scientists – all the way back to 1610 when Galileo Galilei found the first moons beyond Earth.",
        "Jupiter has a long history of surprising scientists – all the way back to 1610 when Galileo Galilei found the first moons beyond Earth. That discovery changed the way we see the universe.\n" +
                "\n" +
                "Fifth in line from the Sun, Jupiter is, by far, the largest planet in the solar system – more than twice as massive as all the other planets combined.\n" +
                "\n" +
                "Jupiter's familiar stripes and swirls are actually cold, windy clouds of ammonia and water, floating in an atmosphere of hydrogen and helium. Jupiter’s iconic Great Red Spot is a giant storm bigger than Earth that has raged for hundreds of years.\n" +
                "\n" +
                "One spacecraft – NASA's Juno orbiter – is currently exploring this giant world.",
        "Gas Giant","Guru"
    ),
    UniverseModel(
        R.drawable.img_planet_neptune,
        "Neptune",
        "Dark, cold, and whipped by supersonic winds, ice giant Neptune is the eighth and most distant planet in our solar system.",
        "Dark, cold, and whipped by supersonic winds, ice giant Neptune is the eighth and most distant planet in our solar system.\n" +
                "\n" +
                "More than 30 times as far from the Sun as Earth, Neptune is the only planet in our solar system not visible to the naked eye and the first predicted by mathematics before its discovery. In 2011 Neptune completed its first 165-year orbit since its discovery in 1846.\n" +
                "\n" +
                "NASA's Voyager 2 is the only spacecraft to have visited Neptune up close. It flew past in 1989 on its way out of the solar system.",
        "Ice Giant","Janus"
    ),
    UniverseModel(
        R.drawable.img_planet_mercury,
        "Mercury",
        "The smallest planet in our solar system and nearest to the Sun, Mercury is only slightly larger than Earth's Moon.",
        "The smallest planet in our solar system and nearest to the Sun, Mercury is only slightly larger than Earth's Moon.\n" +
                "\n" +
                "From the surface of Mercury, the Sun would appear more than three times as large as it does when viewed from Earth, and the sunlight would be as much as seven times brighter. Despite its proximity to the Sun, Mercury is not the hottest planet in our solar system – that title belongs to nearby Venus, thanks to its dense atmosphere.\n" +
                "\n" +
                "Because of Mercury's elliptical – egg-shaped – orbit, and sluggish rotation, the Sun appears to rise briefly, set, and rise again from some parts of the planet's surface. The same thing happens in reverse at sunset.",
        "Terrestrial","Nabu"
    ),
    UniverseModel(
        R.drawable.img_planet_saturn,
        "Saturn",
        "Saturn is the sixth planet from the Sun and the second-largest planet in our solar system.",
        "Saturn is the sixth planet from the Sun and the second-largest planet in our solar system.\n" +
                "\n" +
                "Adorned with thousands of beautiful ringlets, Saturn is unique among the planets. It is not the only planet to have rings – made of chunks of ice and rock – but none are as spectacular or as complicated as Saturn's.\n" +
                "\n" +
                "Like fellow gas giant Jupiter, Saturn is a massive ball made mostly of hydrogen and helium.",
        "Gas Giant","Cronus"
    ),
    UniverseModel(
        R.drawable.img_planet_venus,
        "Venus",
        "Venus is the second planet from the Sun and is Earth’s closest planetary neighbor.",
        "Venus is the second planet from the Sun and is Earth’s closest planetary neighbor. It’s one of the four inner, terrestrial (or rocky) planets, and it’s often called Earth’s twin because it’s similar in size and density. These are not identical twins, however – there are radical differences between the two worlds.\n" +
                "\n" +
                "Venus has a thick, toxic atmosphere filled with carbon dioxide and it’s perpetually shrouded in thick, yellowish clouds of sulfuric acid that trap heat, causing a runaway greenhouse effect. It’s the hottest planet in our solar system, even though Mercury is closer to the Sun. Surface temperatures on Venus are about 900 degrees Fahrenheit (475 degrees Celsius) – hot enough to melt lead. The surface is a rusty color and it’s peppered with intensely crunched mountains and thousands of large volcanoes. Scientists think it’s possible some volcanoes are still active.\n" +
                "\n" +
                "Venus has crushing air pressure at its surface – more than 90 times that of Earth – similar to the pressure you'd encounter a mile below the ocean on Earth.\n" +
                "\n" +
                "Another big difference from Earth – Venus rotates on its axis backward, compared to most of the other planets in the solar system. This means that, on Venus, the Sun rises in the west and sets in the east, opposite to what we experience on Earth. (It’s not the only planet in our solar system with such an oddball rotation – Uranus spins on its side.)\n" +
                "\n" +
                "Venus was the first planet to be explored by a spacecraft – NASA’s Mariner 2 successfully flew by and scanned the cloud-covered world on Dec. 14, 1962. Since then, numerous spacecraft from the U.S. and other space agencies have explored Venus, including NASA’s Magellan, which mapped the planet's surface with radar. Soviet spacecraft made the most successful landings on the surface of Venus to date, but they didn’t survive long due to the extreme heat and crushing pressure. An American probe, one of NASA's Pioneer Venus Multiprobes, survived for about an hour after impacting the surface in 1978.\n" +
                "\n" +
                "More recent Venus missions include ESA’s Venus Express (which orbited from 2006 until 2016) and Japan’s Akatsuki Venus Climate Orbiter (orbiting since 2016).\n" +
                "\n" +
                "NASA’s Parker Solar Probe has made multiple flybys of Venus. On Feb. 9, 2022, NASA announced the spacecraft had captured its first visible light images of the surface of Venus from space during its February 2021 flyby.",
        "Terrestrial","Lucifer / Hesperus"
    ),
    UniverseModel(
        R.drawable.img_planet_uranus,
        "Uranus",
        "Uranus is the seventh planet from the Sun, and has the third-largest diameter in our solar system.",
        "Uranus is the seventh planet from the Sun, and has the third-largest diameter in our solar system.",
        "Ice Giant","Sky King Star"
    ),
    UniverseModel(
        R.drawable.img_planet_55_cancri_e,
        "55 Cancri e",
        "A toasty world that rushes around its star every 18 hours",
        "55 Cancri e is a toasty world that rushes around its star every 18 hours. It orbits so closely -- about 25 times closer than Mercury is to our sun -- that it is tidally locked with one face forever blisters under the heat of its sun. The planet is proposed to have a rocky core surrounded by a layer of water in a \"supercritical\" state, where it is both liquid and gas, and then the whole planet is thought to be topped by a blanket of steam.",
        "Exoplanet","Toasty World"
    ),
    UniverseModel(
        R.drawable.img_planet_kepler186f,
        "Kepler-186f",
        "The first rocky planet to be found within the habitable zone -- the region around the host star where the temperature is right for liquid water.",
        "Kepler-186f was the first rocky planet to be found within the habitable zone -- the region around the host star where the temperature is right for liquid water. This planet is also very close in size to Earth. Even though we may not find out what's going on at the surface of this planet anytime soon, it's a strong reminder of why new technologies are being developed that will enable scientists to get a closer look at distant worlds.",
        "Exoplanet","Rocky"
    ),
    UniverseModel(
        R.drawable.img_planet_2hd_209458_b,
        "HD 209458 b",
        "The first planet to be seen in transit (crossing its star) and the first planet to have it light directly detected.",
        "The first planet to be seen in transit (crossing its star) and the first planet to have it light directly detected. The HD 209458 b transit discovery showed that transit observations were feasible and opened up an entire new realm of exoplanet characterization.",
        "Exoplanet","Osiris"
    ),
    UniverseModel(
        R.drawable.img_planet_51peg,
        "51 Pegasi b",
        "The first confirmed exoplanet around a sun-like star.",
        "This giant planet, which is about half the mass of Jupiter and orbits its star every four days, was the first confirmed exoplanet around a sun-like star, a discovery that launched a whole new field of exploration.",
        "Exoplanet","Pegasi"
    ),
    UniverseModel(
        R.drawable.img_planet_6corot7b,
        "CoRoT 7b",
        "The first super-Earth identified as a rocky exoplanet",
        "The first super-Earth identified as a rocky exoplanet, this planet proved that worlds like the Earth were indeed possible and that the search for potentially habitable worlds (rocky planets in the habitable zone) might be fruitful.",
        "Exoplanet","Rocky For Habitable Zone"
    ),
    UniverseModel(
        R.drawable.img_planet_kepler22b,
        "Kepler-22b",
        "A planet in the habitable zone and a possible water-world planet unlike any seen in our solar system.",
        "Kepler-22b is a super-Earth that could be covered in a super ocean. The jury is still out on Kepler-22b’s true nature; at 2.4 times Earth’s radius, it might even be gaseous. But theoretically an ocean world tipped on its side – a bit like our solar system’s ice giant, Uranus – turns out to be comfortably habitable based on recent computer modeling. Researchers found that an exoplanet in Earth’s size range, at a comparable distance from its sun and covered in water, could have an average surface temperature of about 60 degrees Fahrenheit (15.5 Celsius). Because of its radical tilt, its north and south poles would be alternately bathed in sunlight and darkness, for half a year each, as the planet circled its star.",
        "Super Earth","Exo Earth"
    ),
    UniverseModel(
        R.drawable.img_planet_kepler10b,
        "Kepler-10b",
        "Kepler's first rocky planet discovery is a scorched, Earth-size world",
        "Kepler's first rocky planet discovery is a scorched, Earth-size world that scientists believe may have a lava ocean on its surface.",
        "Exoplanet","Scorched Kepler"
    ),
)

val listGalaxy = listOf<UniverseModel>(
    UniverseModel(
        R.drawable.img_galaxy_andromeda,
        "Andromeda",
        "A barred spiral galaxy approximately 2.5 million light-years (770 kiloparsecs) from Earth and the nearest major galaxy to the Milky Way.",
        "Andromeda Galaxy, also called Andromeda Nebula, (catalog numbers NGC 224 and M31), great spiral galaxy in the constellation Andromeda, the nearest large galaxy. The Andromeda Galaxy is one of the few visible to the unaided eye, appearing as a milky blur. It is located about 2,480,000 light-years from Earth; its diameter is approximately 200,000 light-years; and it shares various characteristics with the Milky Way system. It was mentioned as early as 965 CE, in the Book of the Fixed Stars by the Islamic astronomer al-Ṣūfī, and rediscovered in 1612, shortly after the invention of the telescope, by the German astronomer Simon Marius, who said it resembled the light of a candle seen through a horn. For centuries astronomers regarded the Andromeda Galaxy as a component of the Milky Way Galaxy—i.e., as a so-called spiral nebula much like other glowing masses of gas within the local galactic system (hence the misnomer Andromeda Nebula). Only in the 1920s did the American astronomer Edwin Powell Hubble determine conclusively that the Andromeda was in fact a separate galaxy beyond the Milky Way.",
        "SA(s)b","Galaxy M31"
    ),
    UniverseModel(
        R.drawable.img_galaxy_antennae,
        "Antennae",
        "The Antennae Galaxies are a pair of interacting galaxies in the constellation Corvus.",
        "During the course of the collision, billions of stars will be formed. The brightest and most compact of these star birth regions are called super star clusters.\n" +
                "\n" +
                "The two spiral galaxies started to interact a few hundred million years ago, making the Antennae galaxies one of the nearest and youngest examples of a pair of colliding galaxies. Nearly half of the faint objects in the Antennae image are young clusters containing tens of thousands of stars. The orange blobs to the left and right of image center are the two cores of the original galaxies and consist mainly of old stars criss-crossed by filaments of dust, which appears brown in the image. The two galaxies are dotted with brilliant blue star-forming regions surrounded by glowing hydrogen gas, appearing in the image in pink.",
        "SB(s)m pec / SA(s)m pec","NGC 4038/NGC 4039 or Caldwell 60/Caldwell 61"
    ),
    UniverseModel(
        R.drawable.img_galaxy_backward,
        "Backward",
        "The spiral galaxy, NGC 4622 (also called Backward galaxy), lies approximately 111 million light years away from Earth in the constellation Centaurus.",
        "Astronomers have found a spiral galaxy that may be spinning to the beat of a different cosmic drummer.\n" +
                "\n" +
                "To the surprise of astronomers, the galaxy, called NGC 4622, appears to be rotating in the opposite direction to what they expected. Pictures by NASA's Hubble Space Telescope helped astronomers determine that the galaxy may be spinning clockwise by showing which side of the galaxy is closer to Earth. A Hubble telescope photo of the oddball galaxy is this month's Hubble Heritage offering. The image shows NGC 4622 and its outer pair of winding arms full of new stars [shown in blue].\n" +
                "\n" +
                "Astronomers are puzzled by the clockwise rotation because of the direction the outer spiral arms are pointing. Most spiral galaxies have arms of gas and stars that trail behind as they turn. But this galaxy has two \"leading\" outer arms that point toward the direction of the galaxy's clockwise rotation. To add to the conundrum, NGC 4622 also has a \"trailing\" inner arm that is wrapped around the galaxy in the opposite direction it is rotating. Based on galaxy simulations, a team of astronomers had expected that the galaxy was turning counterclockwise.\n" +
                "\n" +
                "NGC 4622 is a rare example of a spiral galaxy with arms pointing in opposite directions. What caused this galaxy to behave differently from most galaxies? Astronomers suspect that NGC 4622 interacted with another galaxy. Its two outer arms are lopsided, meaning that something disturbed it. The new Hubble image suggests that NGC 4622 consumed a small companion galaxy. The galaxy's core provides new evidence for a merger between NGC 4622 and a smaller galaxy. This information could be the key to understanding the unusual leading arms.",
        "SA(r)ab","NGC 4622"
    ),
    UniverseModel(
        R.drawable.img_galaxy_bodes,
        "Bode's",
        "A grand design spiral galaxy located in the constellation Ursa Major.",
        "Astronomers have found a spiral galaxy that may be spinning to the beat of a different cosmic drummer.\n" +
                "\n" +
                "To the surprise of astronomers, the galaxy, called NGC 4622, appears to be rotating in the opposite direction to what they expected. Pictures by NASA's Hubble Space Telescope helped astronomers determine that the galaxy may be spinning clockwise by showing which side of the galaxy is closer to Earth. A Hubble telescope photo of the oddball galaxy is this month's Hubble Heritage offering. The image shows NGC 4622 and its outer pair of winding arms full of new stars [shown in blue].\n" +
                "\n" +
                "Astronomers are puzzled by the clockwise rotation because of the direction the outer spiral arms are pointing. Most spiral galaxies have arms of gas and stars that trail behind as they turn. But this galaxy has two \"leading\" outer arms that point toward the direction of the galaxy's clockwise rotation. To add to the conundrum, NGC 4622 also has a \"trailing\" inner arm that is wrapped around the galaxy in the opposite direction it is rotating. Based on galaxy simulations, a team of astronomers had expected that the galaxy was turning counterclockwise.\n" +
                "\n" +
                "NGC 4622 is a rare example of a spiral galaxy with arms pointing in opposite directions. What caused this galaxy to behave differently from most galaxies? Astronomers suspect that NGC 4622 interacted with another galaxy. Its two outer arms are lopsided, meaning that something disturbed it. The new Hubble image suggests that NGC 4622 consumed a small companion galaxy. The galaxy's core provides new evidence for a merger between NGC 4622 and a smaller galaxy. This information could be the key to understanding the unusual leading arms.",
        "SA(s)ab, LINER","Messier 81"
    ),
    UniverseModel(
        R.drawable.img_galaxy_black_eye,
        "Black Eye",
        "A relatively isolated spiral galaxy 17 million light-years away in the mildly northern constellation of Coma Berenices.",
        "Easily identified by the spectacular band of absorbing dust partially obscuring its bright nucleus, M64, or the Black Eye galaxy, is characterized by its bizarre internal motion. The gas in the outer regions of this remarkable galaxy is rotating in the opposite direction from the gas and stars in its inner regions. This strange behavior can be attributed to a merger between M64 and a satellite galaxy over a billion years ago.\n" +
                "\n" +
                "New stars are forming in the region where the oppositely rotating gases collide, are compressed, and then contract. Particularly noticeable in this stunning Hubble image of the galaxy’s core are hot, blue stars that have just formed, along with pink clouds of glowing hydrogen gas that fluoresce when exposed to ultraviolet light from newly formed stars.\n" +
                "\n" +
                "M64 was discovered by the English astronomer Edward Pigott. It is located 17 million light-years from Earth in the constellation Coma Berenices and is best observed in May. With an apparent magnitude of 9.8, the Black Eye galaxy can be spotted with a moderately sized telescope.",
        "(R)SA(rs)ab, HIISy2","Evil Eye Galaxy"
    ),
    UniverseModel(
        R.drawable.img_galaxy_butterfly,
        "Butterfly",
        "Shining brightly in ultraviolet light but hidden from direct view by a dense torus of dust.",
        "The bright clusters and nebulae of planet Earth's night sky are often named for flowers or insects. Though its wingspan covers over 3 light-years, NGC 6302 is no exception. With an estimated surface temperature of about 250,000 degrees C, the dying central star of this particular planetary nebula has become exceptionally hot, shining brightly in ultraviolet light but hidden from direct view by a dense torus of dust.\n" +
                "\n" +
                "This sharp and colorful close-up of the dying star's nebula was recorded in 2009 by the Hubble Space Telescope's Wide Field Camera 3, installed during the final shuttle servicing mission. Cutting across a bright cavity of ionized gas, the dust torus surrounding the central star is near the center of this view, almost edge-on to the line-of-sight. Molecular hydrogen has been detected in the hot star's dusty cosmic shroud. NGC 6302 lies about 4,000 light-years away in the arachnologically correct constellation of the Scorpion (Scorpius).",
        "Siamese Twins","Siamese Twins"
    ),
    UniverseModel(
        R.drawable.img_galaxy_virgo_a,
        "Virgo A",
        "Giant elliptical galaxy in the constellation Virgo whose nucleus contains a black hole.",
        "M87, in full Messier 87, also called Virgo A or NGC4486, giant elliptical galaxy in the constellation Virgo whose nucleus contains a black hole, the first ever to be directly imaged. M87 is the most powerful known source of radio energy among the thousands of galactic systems constituting the so-called Virgo Cluster. It is also a powerful X-ray source, which suggests the presence of very hot gas in the galaxy. A luminous gaseous jet projects outward from the galactic nucleus. Both the jet and the nucleus emit synchrotron radiation, a form of nonthermal radiation released by charged particles that are accelerated in magnetic fields and travel at speeds near that of light. M87 lies about 55 million light-years from Earth.\n" +
                "\n" +
                "In 2017 the Event Horizon Telescope obtained images of the central region of M87 that showed an asymmetric ring of radio emission surrounding a dark object. The central object is the black hole’s shadow, which is about five times larger than the black hole itself. The black hole is six and a half billion times the mass of the Sun and 38 billion km (24 billion miles) across. The gravitational field of the black hole is so strong that not even light can escape. The ring is brighter on one side because the black hole is rotating, and thus material on the side of the black hole turning toward Earth has its emission boosted by the Doppler effect. Gravitational energy released by gas spiraling down into the black hole produces a beam of electrons accelerated almost to the speed of light. The bright gaseous jet that emanates from M87 is thought to be radiation from this beam of electrons.",
        "Supergiant elliptical galaxy","Messier 87, NGC4486"
    )
)