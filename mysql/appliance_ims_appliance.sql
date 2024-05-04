-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: stock_management
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `appliance`
--

DROP TABLE IF EXISTS `appliance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appliance` (
  `ApplianceID` int NOT NULL,
  `ApplianceName` varchar(500) NOT NULL,
  `Category` varchar(30) NOT NULL,
  `SubCategory` varchar(30) NOT NULL,
  `ModelNumber` varchar(20) NOT NULL,
  `Weight` varchar(20) NOT NULL,
  `Brand` varchar(50) NOT NULL,
  `Service` varchar(200) DEFAULT NULL,
  `Price` double NOT NULL,
  `Stocks` int NOT NULL,
  `Availability` tinyint(1) DEFAULT '1',
  `ApplianceSKU` varchar(12) DEFAULT NULL,
  `Discontinued` tinyint(1) DEFAULT '0',
  `RegDateTime` datetime NOT NULL,
  `ADescription` text,
  `AComment` varchar(500) DEFAULT NULL,
  `AddedBy` int NOT NULL,
  PRIMARY KEY (`ApplianceID`),
  KEY `AddedBy` (`AddedBy`),
  CONSTRAINT `appliance_ibfk_1` FOREIGN KEY (`AddedBy`) REFERENCES `user` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appliance`
--

LOCK TABLES `appliance` WRITE;
/*!40000 ALTER TABLE `appliance` DISABLE KEYS */;
INSERT INTO `appliance` VALUES (1000,'Palsonic Australia 32\" Full Hd Android Smart Led Tv','Home AV','Television','32QF7000','6.4 pounds','Palsonic Australia','Warranty- 2 Year / Repair- 1 Year Breakage Insurance',8970,8990,1,'#3N0DFELTEFL',0,'2021-03-01 09:12:43','- Screen Size: 40\"\n- Screen Resolution: Full HD (1920×1080)\n- Android Smart 8.0\n- 1 GB RAM, 8 GB ROM\n- Smart Energy Saving\n- Dolby Digital, Slim Design\n- 2 Years With 1 Year Breakage Insurance\n- Warranty Policy EN\n	Warranty shall not coverpanel\n- What’s in the box\n	1xPalsonic Australia 40\" Full HD Android Smart LED TV','',106481),(1001,'Kasa Smart Plug by TP-Link, Smart Home WiFi Outlet works with Alexa, Echo,Google Home & IFTTT,No Hub Required, Remote Control, 15 Amp, UL certified, 1-Pack','Smart Home','Switch','HS105','3.52 ounces','TP-Link','Warranty- 2 Year',4320,260,1,'#1C50WS1INC5',0,'2021-01-02 07:09:52','- Control From Anywhere: Turn electronics on or off from anywhere with your smartphone using the Kasa app (Compatible w/ Android & iOS)\n- Voice Control: Works with Amazon Alexa, Google Assistant and MicroSoft Cortana supported devices for a hands free experience\n- Compact Design: Won\'t block the other wall outlet allowing two Smart Plugs to be installed side by side\n- Kasa scenes & schedules: Schedule the Smart plug to automatically switch on and off when away or set a scene for controlling many devices with a single button\n- Note: Requires a secured 2.4 GigaHertz Wi Fi network connection\n- Color: White\n- Voltage: 120 Volts\n- Included Components\n	Smart Wi-Fi Plug Mini HS105, Quick Start Guide','',209841),(1002,'Oster French Convection Countertop and Toaster Oven | Single Door Pull and Digital Controls | Stainless Steel, Extra Large','Kitchenware','Oven','B014D9LBCY','18.1 Pounds','Oster','Guarantee- 1 Year',41999.99,36,1,'#EIOOYOOBYOL',1,'2021-09-01 10:09:07','- Single door pull opens both doors with 1 hand ease and convenience\n- Digital controls provide precise cooking time and temperature to take the guesswork out of cooking\n- Turbo convection baking technology cooks faster and browns more evenly\n- Two racks provide maximum cooking flexibility; This oven control allows you to slowly cook your food at a preset temperature of 150°F for an adjustable time of upto 6 hours\n- Extra large interior accommodates 2 16 inches pizzas; Preheat setting gets oven temperature up to where you need for precise cooking\n- 90 minute timer with signal turns oven off automatically\n- Product Dimensions: 22 x 19.5 x 13 inches','',106481),(1003,'Shark NV752 Rotator Powered Lift-Away TruePet Upright Vacuum with HEPA Filter, Crevice Tool, Pet Multi-Tool and Power Brush with a Bordeaux Finish, .88 Dry Quarts','Cleaning','Vacuum Cleaner','NV752','15.4 pounds','SharkNinja','Warranty- 7 Year Limited',23959.99,231,1,'#5V7R7TVVNNS',0,'2021-06-13 04:03:03','- Shark\'s original full-sized Powered Lift-Away. The pod detaches to deep-clean, hard-to-reach areas while still delivering power to keep the brushroll spinning.\n- Anti-Allergen Complete Seal Technology and a HEPA filter trap over 99.9% of dust and allergens inside the vacuum.\n- Large capacity with full-size performance for a whole-home clean\n- LED headlights to spot hidden debris.\n- Fingertip controls allow you to easily switch from Hard Floor to Carpet mode.\n- Extra tools included like the Pet Power Brush to tackle pet hair, embedded dirt and more.\n- Voltage: 100120 Volts\n- Power Source: Corded Electric\n- Cord length (ft.): 25\n- Included Components\n	12\" Crevice Tool, Pet Multi-Tool, Pet Power Brush','',129850),(1004,'TCL 32\" 3-Series 720p Roku Smart TV','Home AV','Television','32S335','8.2 pounds','TCL','Warranty- 1 Year Limited / Guarantee- 2 Year',24599.99,67,1,'#L5IS32IOSLO',0,'2021-09-14 18:02:48','- Dimensions with Stand (W x H x D): 28.8\" x 18.9\" x 7.1\" | Without Stand (W x H x D): 28.8\" x 17.2\" x 2.9\" | Weight with Stand: 8.2 lbs | Weight without Stand: 8.0 lbs\n- Smart functionality delivers all your favorite content with over 500,000 movies and TV episodes, accessible through the simple and intuitive Roku TV\n- HD, Resolution: High definition (720p) resolution for excellent detail, color and contrast\n- Dual band Wi-Fi: Get fast and easy access to your favorite content to the dual band Wi-Fi connection\n- Inputs: 3 HDMI 2.0 with HDCP 2.2 (one with HDMI ARC), 1 USB (media player), RF, Composite, Headphone Jack, Optical Audio Out\n- Easy Voice Control: Works with Amazon Alexa or Google Assistant to help you find movie titles, launch or change channels, even switch inputs, using just your voice. Also available through the Roku mobile app\n- Resolution: 720p\n- Connections: Wi-Fi, USB, HDMI\n- Display Technology: LE\n- Product Dimension: 28.8 x 7.1 x 18.9 inches','',129850),(1005,'Sony X750H 65-inch 4K Ultra HD LED TV (2020 Model) with S100F 2.0ch Soundbar with Bass Reflex Speaker','Home AV','Television','XBR55X900H','46.3 pounds','Sony','Warranty- 3 Year',489000,10,0,'#SXEBDDIEXXL',0,'2021-05-07 11:03:07','- 4K PROCESSOR X1: See incredible 4K pictures, rich with real-world detail and texture, powered by our 4K Processor X1. Even images filmed in Full HD are upscaled close to 4K resolution by 4K X-Reality PRO using a unique 4K database\n- TRILUMINOS Display: See exactly what the creator intended with advanced color and gradation\n- SMART ANDROID TV with GOOGLE ASSISTANT: Use your voice to control your TV and smart home devices, easily search for movies and shows, get answers, and manage tasks\n- HDR: High Dynamic Range (HDR) picture is the way TV was always meant to be watched. Ultra-high resolution and HDR video content combine to bring dazzling detail, color and contrast to everything you watch, while keeping a far wider range of brightness\n- GAME MODE: Take your PlayStation experience to the next level with a Sony 4K gaming TV featuring dedicated Game Mode for a smoother, more responsive gaming experience\n- MOTIONFLOW XR240: Less blur, even in fast scenes. Content appears with lifelike motion\n- DESIGN: Stay focused on the big picture with a refined design and narrow bezel that blends into any environment\n- Resolution: 4K\n- Connections: Bluetooth\n- Display Technology: QLED\n- Product Dimensions: 48.5 x 13.38 x 30.75 inches','',209841),(1006,'Panasonic Microwave Oven NN-SN966S Stainless Steel Countertop/Built-In, 2.2 Cubic Foot, 1250W & 27\" Trim Kit 1.2cu ft Microwave Oven NN-TK621SS (Stainless Steel), 1.2cft','Kitchenware','Microwave','TK621SS','45 lb (20.4 kg)','Panasonic','Guarantee- 2 Year Limited',47000,69,1,'#M61MSASOESS',0,'2021-06-28 10:44:18','- Panasonic Microwave: This 1250 Watt high power, 2.2 cubic foot capacity stainless steel countertop/built in microwave delivers a seamless stream of cooking power for even cooking and delicious flavor\n- Inverter Technology with Turbo Defrost: Patented Inverter Technology generates a seamless stream of power and delivers consistent, evenly prepared food without overcooking; Advanced Inverter Turbo Defrost speeds up defrosting time\n- Large Family Size: This countertop microwave with 16.5 inch turntable is thinner, lighter and more efficient, allowing you to devote less space to electronics and more to interior capacity; Internal dimensions (H x W x D): 10.94 inch x 18.44 inch x 18.50 inch. Outside dimension HxWxD (Inches) 14 x 23.9 x 19.4\n- Smart Cooking Settings with Genius Sensor: Built in automatic genius sensor adjusts power and times based on different foods; Other advantages include 14 preset menu items, quick minute timer, delay start and child safety lock\n- Keep Warm Feature: This inverter microwave keeps soups, gravies or desserts warm and fresh until ready to serve\n- Material: Stainless Steel\n- Voice command: Buttons\n- Installation Type: Countertop\n- Energy Use: 1250 Watts\n- Capacity: 1.5 Cu. Ft.','',106481),(1007,'Google Nest Learning Thermostat - Programmable Smart Thermostat for Home - 3rd Generation Nest Thermostat - Works with Alexa - Stainless Steel','Smart Home','Thermostat','T3007ES','1 pounds','Google','Guarantee- 1 Year Limited',24699.99,256,0,'#AESMRI3TNTT',0,'2021-11-24 15:04:23','- Programmable smart thermostat that learns your schedule and the temperatures you like and programs itself to help you save energy and stay comfortable\n- Home/Away Assist automatically adjusts itself to an Eco Temperature after you leave, so you don’t heat or cool an empty home\n- Remote control lets family members change the temperature from anywhere on a phone, laptop, or tablet[1]\n- With Energy History, just check your phone to see how much energy you used and why, or use Quick View on the thermostat’s display to reach Energy History, settings, or your schedule\n- The Nest Leaf appears when you choose a temperature that saves energy\n- Smart thermostat with HVAC monitoring, which looks out for your heating and cooling systems; sends an alert if something doesn’t seem right, along with helpful reminders to make maintenance easier[2\n- The Nest Learning Thermostat works with the Nest Temperature Sensor (sold separately) to help make sure a certain room is the exact temperature you want it to be\n- Beautifully designed, with polished metal finishes and bright, high resolution display; Farsight shows you the temperature, weather, or time on your thermostat when you walk in the room\n- It’s easy to install your thermostat, typically in 30 minutes or less, with everything you need included in the box; compatible with 95% of heating and cooling systems\n- Please refer to the product description section below for all applicable legal disclaimers denoted by the bracketed numbers in the preceding bullet points (e.g., [1], [2], etc.)\n- Product Dimensions: 3.3 x 3.3 x 1.21 inches\n- Color: Stainless Steel\n- Style: Thermostat Only\n- Finish: Stainless Steel\n- Material: Metal\n- Pattern: Minimalistic\n- Shape: Circular\n- Power Source: Battery powered\n- Voltage: 24 Volts\n- Type of Bulb: LED\n- Special Features: Wireless: Working Wi-Fi connection: 802.11b/g/n @ 2.4GHz, 5GHz, Wireless interconnect: 802.15.4 @ 2.4GHz, Bluetooth Low Energy (BLE)\n-Included Components: Display, Base, Optional trim kit, Mounting screws and labels, Nest screwdriver, Installation Guide, Welcome Guide, Nest Pro installation card','',209841),(1008,'Bose Home Speaker 300, with Amazon Alexa built-in, Silver','Home AV','Speakers','808429-1300','2.09 pounds','BOSE','Warranty- 1 Year',23000,89,1,'#0NPPN184SA0',1,'2021-12-09 11:11:04','- Sound performance: Room-rocking bass and 360-degree, lifelike sound in a compact size\n- Built-in Alexa: Amazon Alexa and Google Assistant are built into this smart speaker for hands-free voice control. And a noise-rejecting mic system listens in every direction for your voice\n- Connectivity: Pair your device to this home speaker to stream your favorite music and more via a Bluetooth connection, your home Wi-Fi network, Apple AirPlay 2, or Spotify Connect\n- Control: Easily control your home speaker with three different ways to manage what you hear: your voice, the Bose Music app, or 6 one-touch presets on top of the speaker\n- Make or take calls: With Alexa only, make or take calls from this smart speaker to Bose smart products, Amazon Echo products, and anyone in your contacts list. Hands free, phone free, and free of charge\n- Bose Music app: Use the Bose Music app for simple setup with detailed prompts\n- Compatible products: This home speaker is part of the Bose Smart Family and works with other Bose smart speakers and soundbars for a multi-room listening experience\n- Bose SimpleSync: Use Bose SimpleSync technology to pair a member of the Bose Smart Family with a Bose Bluetooth or SoundTouch speaker for synchronized music playback\n- DIMENSIONS: 6.3” x 5.5” x 4”','',129850),(1009,'Samsung RS25H5111WW Energy Star 24.5 Cu. Ft. Side-by-Side Refrigerator/Freezer with External Water/Ice Dispenser and In-Door Ice Maker, White','Kitchenware','Refrigerators','RS25H5111WW/AA','279 pounds','SAMSUNG','Warranty- 1 Year / Repair- 5 Years sealed system parts and labor',367000,11,0,'#RRIA1ASAR21',1,'2021-09-07 08:38:24','- Twin cooling plus system, multi air flow, Power Freeze and Power Cool options, plus LED lighting\n- Premium external filtered water & ice dispenser, plus automatic in-door icemaker\n- 24.5 cu. ft. total capacity: 15.3 refrigerator side , 9.2 freezer side\n- 4 tempered-glass spill-proof shelves, 3 clear crispers, 1 dairy bin and 4 door bins\n- Freezer side includes 4 tempered-glass shelves, 2 clear drawers and 3 tilting door bins\n-Energy Use: 634 Kilowatt Hours\n- Capacity: 24.5 Cubic Feet\n- Refrigerator Fresh Food Capacity: 15.3 Cubic Feet\n- Freezer Capacity: 9.2 Cubic Feet\n- Installation Type: Freestanding','',106481),(1010,'NVIDIA SHIELD Android TV 4K HDR Streaming Media Player; High Performance, Dolby Vision, Google Assistant Built-In, Works with Alexa','Home AV','TV Stick','945-13430-2500-000','13.6 Ounces','NVIDIA','Guarantee- 1 Year Limited',28009.99,89,1,'#E3K0T2ASIIT',0,'2021-11-21 17:54:11','- Fast. Really Fast. SHIELD TV takes media streaming to a whole new level, powered by the NVIDIA Tegra X1+ processor, SHIELD TV is the world’s most powerful Android TV streaming media player.\n- Dolby Vision - Atmos. Bring your home theater to life with Dolby Vision HDR and Dolby Atmos surround sound—delivering ultra-vivid picture quality and immersive audio. Enhance HD video in real-time to 4K for clearer, crisper visuals using next-generation AI upscaling.\n- Best-In-Class Design. The new SHIELD TV is compact, stealth, and designed to disappear behind your entertainment center, right along with your cables. With Gigabit Ethernet, dual-band AC Wi-Fi, a built-in power supply, and a microSD card slot for storage expansion, it is powerful, feature-packed, and built for behind-the-scenes brilliance. The all-new remote is more advanced than ever with motion-activated, backlit buttons—including a user-customizable button. With voice control, Bluetooth, IR control for your TV, and a built-in lost remote locator, you have the most advanced remote yet.\n- Unlimited Entertainment. Get the most 4K content of any streaming media player. Watch Netflix, Amazon Video, Disney+ and Vudu in crisp 4K HDR, and YouTube, Hulu Live, Google Play Movies & TV, and more in 4K. Stream from your phone with built-in Chromecast 4K. Add a game controller (sold separately) and play today’s most popular games like Fortnite with GeForce NOW\n- Voice Control. The built-in Google Assistant is at your command. See photos, live camera feeds, weather, sports scores, and more on the big screen. Dim the lights and immerse yourself in your favorite show or music using your voice. And control your SHIELD hands-free with Google Home or Alexa and Echo.\n- Included Components: Remote Controller\n- Power Source Type: Corded Electric\n-Connections: Wi-Fi, Ethernet\n- Supported Internet Services: Netflix, Pandora, HBO, Disney +, Vudu, Amazon Instant Video, Hulu Plus, YouTube, Browser\n- Memory Storage Capacity: 8 GB\n- Item Dimensions LxWxH: 6.5 x 1.57 x 1.57 inches\n- Controller Type: Google Assistant, Amazon Alexa','',129850),(1011,'Honeywell HT-900 TurboForce Air Circulator Fan Black, Small','Heating & Cooling','Fan','HT-900','5.02 pounds','Honeywell','Warranty- 6 Months',4100,106,1,'#FFA00ILTAHH',0,'2021-05-08 11:03:24','- Small fan for table or floor: The Honeywell turbo force air circulator fan has 3 speeds & a 90 degree pivoting head. This quiet fan is compact enough for on a table or wall mount & - powerful enough to help provide comfortable cooling in small-medium rooms.\n- Feel the power: Honeywell\'s TurboForce line of fans have an aerodynamic turbo design to maximize air movement, offering the power for intense cooling or energy-saving air circulation. The ease of a small fan with power you can feel from 27 feet away\n- Increase your comfort: Using fans for air circulation in your home can help Increase your comfort, and help reduce energy costs as well. Honeywell carries a range of tower fans, floor fans, and oscillating fans -- find one for every room in the house.\n- Honeywell fans: The right fan helps cool you off & improves airflow in your room or home. Give your air conditioner & wallet a break by using fans to help reduce your energy consumption & costs. Honeywell carries a variety of fans to meet your home needs.\n- Honeywell quality: Help improve air circulation & energy savings in your home, bedroom or office with Honeywell Fans.\n- Product Dimensions: 8.94\" x 6.3\" x 10.9\"','',209841),(1012,'XHCP Portable Washing Machine Portable Semiautomatic Washing Machine Portable Mini Laundry Washing Machine 9.9lbs Capacity Small Semi-Automatic Compact Washer for Apartment,RV,Traveling,White','Cleaning','Washing Machine','B089KFHBKG','15.7 Lbs','XHCP','Warranty- 2 Years Limited / Repair- 1 Year Parts & Labors',56099.99,21,1,'#IMBKKNKORAB',0,'2021-09-07 21:25:09','★Temperglass panel-The panel is made of temperglass,dustproof and easy to clean,can be usfor decorating home.\n★Fully automatic washing-One button start design on the panel,simple operation,there is no problem with the operation for the elderly and children.\n★Square barrel-There is a magic filer box in the square barrel,which can filter the small amount of waste like paper dust in the washing process, making the laundry cleaner\n★Detachable drain basket-When do washing,take out the drain basket.After washing,put in the drain basket,it\'s turn to do drain.\n★Product parameters-size-430x380X640mm material-polypropylene washing capacity-4.5kg\n- Product name:mini automatic washing machine\n- Product material:plastic(barrel body)+stainless steel(inner tub)\n- Mode:automatic,washing,rinsing,drain.\n- Dehydration effect:general\n- Door opening method:top open\n- Washing capacity:4.5 kg/9.9 Lbs\n- Dewatering capacity: 2 kg/4.4 Lbs\n- Product size:430x380X640MM\n- Ratvoltage:220V~50HZ\n- Ratpower:240W\n- Waterproof level:IPX4','',129850),(1013,'Arlo Pro 3 Spotlight Camera | 3 Camera Security System | Wire-Free, 2K Video & HDR | Color Night Vision, 2-Way Audio, 6-month battery life, 160° View | Works with Alexa | White | VMS4340P','Smart Home','Security Camera','VMS4340P-100NAS','4.66 pounds','Arlo','Warranty- 2 Year Limited / Guarantee- 1 Year',56099.99,36,1,'#34ETAS4C04S',0,'2021-01-29 20:43:01','- Spend less time recharging with 6 months of battery life on one charge.\n- No monthly fees or service contract required.\n- Zoom in to see sharp details - See and record video in 2K with HDR for a clearer, undistorted picture, day or night.\n- See colorful at night - See features like faces or license plates in full color, even at night, with color night vision.\n- Smarter alerts, quicker action - Receive notifications for people, vehicles, and packages so you can take quick action such as sound the siren, call a friend or dial emergency services, with the included, Arlo Smart trial.\n- Respond quickly - Hear and speak to visitors at your door with clear, two-way audio.\n- See a bigger picture - With a wide 160° diagonal viewing angle lens that has an auto image correction, reducing the fisheye effect.\n- Coverage from every corner - Fast, wire-free setup (no wiring required), delivers increased installation flexibility to get the perfect camera view.\n- Local storage option - Secure your videos directly to your Arlo base station or Smarthub (sold separately) and view them anytime anywhere.\n- Plays well with others - Works by Alexa, Google Assistant, Apple HomeKit and Smart Things.\n-  Product Dimensions: 14.57 x 10.39 x 9.57 inches','',209841),(1014,'ViewSonic M1+ Portable Smart Wi-Fi Projector with Dual Harman Kardon Bluetooth Speakers HDMI USB Type C and Built-in Battery (M1PLUS)','Home AV','Projectors','M1+','1.7 pounds','ViewSonic','Warranty- 3 Year Limited',37500,10,0,'#OR1MJMLMM1P',0,'2021-11-26 07:34:29','- PORTABLE PROJECTOR: Ultra-portable WVGA (854x480p) LED projector that delivers convenient entertainment in nearly any room\n- BIG SCREEN PROJECTION: Shorter throw lens project up to 100-inches from 8-feet 9-inches\n- PREMIUM AUDIO: Built-in Dual Harman Kardon Bluetooth speakers deliver room-filling audio\n- SMART TV ENABLED: Integrated Wi-Fi lets you stream and binge from YouTube and more\n- EASY SETUP: Simple setup and control, just plug & play your presentations, videos, and pictures\n- LONG BATTERY LIFE: A built-in battery provides up to 6 hours of power, and can charge mobile devices via USB Type C when the power adapter is plugged in\n- INDUSTRY-LEADING WARRANTY: 3-year limited parts and labor coverage, and access to our US-based customer service team\n- FLEXIBLE CONNECTIVITY: Supports most media players, PCs, Macs, and mobile devices with input options such as HDMI, USB Type C, and more\n- INCLUDED IN THE BOX: M1+ Projector, USB Type C Cable, Remote Control, Projector Case, Quick Start Guide, and Power Adapter\n- Product Dimensions: 5.7 x 4.96 x 1.57 inches','',106481),(1015,'Lasko 755320 Ceramic Space Heater','Heating & Cooling','Air Purifier','755320','8 pounds','Lasko','Warranty- 1 Year Limited',4149.99,53,1,'#EI5A3U275PT',0,'2021-02-02 21:12:29','- 2 Quiet Settings - including high heat and low heat plus an Auto setting make this electric space heater ideal for warming up an area in your home or home office. With widespread oscillation this heater distributes warm air throughout the room\n- Adjustable Thermostat - with digital display allows you to adjust the heater\'s 1500 watt ceramic heating element. With an easy to read digital temperature display you can select a wide range of temperatures in Fahrenheit or Celsius\n- Remote Control & Built-in Timer - allows you to adjust the heater\'s temperature, timer, oscillation and more from a distance. While the easy to program timer allows you to select 1 hour to 8 hours, in 1 hour intervals\n- Built-in Safety Features - overheat protection ensures the space heater does not overheat even if left on for an extended amount of time. While a cool touch exterior keeps the heater cool to the touch even after running for hours\n- Fully Assembled - allows you to take the heater out of the box and have it working it minutes. Simply plug the heater into a wall outlet, adjust the thermostat, and enjoy the warmth from your new Lasko space heater\n- Power Source: Corded electric\n- Heating Method: Convection\n- Item Dimensions LxWxH: 7.25 x 8.6 x 23 inches','',106481),(1016,'Edifier R1280T Powered Bookshelf Speakers - 2.0 Stereo Active Near Field Monitors - Studio Monitor Speaker - Wooden Enclosure - 42 Watts RMS','Home AV','Speakers','R1280T','10.8 pounds','Edifier','Warranty- 2 Year',15000,24,0,'#21RKER8EPRD',0,'2021-12-19 08:05:40','- 2 x AUX INPUT - Convenient connection to any device that has a 3.5mm headphone output or dual RCA output. Connect to two devices via AUX at the same time, no plugging and switching needed. (None Bluetooth version)\n- STUDIO SOUND QUALITY - Natural sound reproduction from 13mm silk dome tweeter and 4 inch full range unit\n- REMOTE CONTROL - Adjust volume at your figure tips. Bass and treble control located on the side of main speaker.\n- CLASSIC WOOD FINISH - High quality MDF wood build finished with wood effect vinyl serves as a great compliment to any home decor.\n- 2 YEAR WARRANTY - Guaranteed high quality and reliability with hassle-free parts and labor warranty for two years in USA and Canada.\n-  Product Dimensions: 6.9 x 9.5 x 5.8 inches','',106481),(1017,'Aroma Housewares 2-8-Cups (Cooked) Digital Cool-Touch Rice Grain Cooker and Food Steamer, Stainless, 8 Cup, Silver','Kitchenware','Rice Cooker','ARC-914SBD','3.6 pounds','Aroma Housewares','Warranty- 2 Year Limited',4000,93,1,'#G1AO4IOARD4',0,'2021-11-13 17:06:30','- Multi-Functional Use – Whether you\'re in the mood for a hearty jambalaya, steamed veggies and rice, or even a delectable cake, you can accomplish it all with your rice cooker. The possibilities are as creative as you are.\n- User-Friendly Programming – Easy-to-use with 4 preset digital functions and automatic Keep Warm mode when the cooking is finished.\n- Nutritious & Delicious – The built-in Steam function allows for nutrient-rich meals to be prepared above while rice, soup, or any other meal simultaneously cooks below, allowing you to save time without sacrificing quality.\n- 15-Hour Delay Timer – The programmable delay timer is great for families on the go, delivering delicious meals ready when they\'re needed, up to 15 hours in advance.\n- Compact Capacity – 8-cup capacity yielding 2 to 8 cups of cooked rice. Its compact capacity is perfect for preparing small individual meals or delicious side dishes.\n- Accessories – Includes a Bonded Granite nonstick inner pot, steam tray, rice measuring cup, and serving spatula. Power consumption: 120V/60Hz 450W\n- Upgraded Inner Pot – The provided 8x Bonded Granite nonstick inner pot that is more durable than ceramic and traditional pots, has a completely toxic-free makeup and is dishwasher safe\n- Item holds up to 2 to 8 cups of cooked rice. 8 cups is the cooked rice capacity. Rice must be cooked in the cup that comes along with this product.\n- Steams meat and vegetables while rice cooks below\n- Easy-to-use, programmable digital controls with automatic Keep-Warm and White Rice and Brown Rice functions\nGreat for soups, jambalaya, chili, and more. Save time with the Flash Rice function which cuts cooking time by up to 50%\n- 15-hour Delay Timer for flexible meal planning\nIncludes steam tray, rice measuring cup, serving spatula, and exclusive recipes and coupons for Mahatma and Carolina Rice\n- Product Dimensions: 8.25 x 9 x 8.5 inches','',209841);
/*!40000 ALTER TABLE `appliance` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-08 23:48:32
