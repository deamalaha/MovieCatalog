package id.ac.unhas.moviecatalog.utils

import id.ac.unhas.moviecatalog.data.DetailShow
import id.ac.unhas.moviecatalog.data.Movie
import id.ac.unhas.moviecatalog.data.TVShow
import id.ac.unhas.moviecatalog.data.source.remote.response.MoviePopular
import id.ac.unhas.moviecatalog.data.source.remote.response.TVShowPopular

object Data {

    fun generateMovies(): List<Movie> {

        val movies = ArrayList<Movie>()

        movies.add(
            Movie(
                1234,
                "Enola Holmes",
                "2020",
                "Enola Holmes film terbaru di Netflix yang bercerita tentang seorang gadis remaja usia 16 tahun bernama Enola. Enola adalah anak terkahir di keluarga Holmes sebuah klan detektif terkenal Sherlock Holmes.\n" +
                        "Setelah kematian ayahnya dan kepergian kakak laki-lakinya, Enola hanya tinggal dan dibesarkan oleh ibunya, Eudoria Holmes. Dari ibunya Enola mendapat ilmu sains dan bela diri jinjutsu. Namun tepat di hari ulang tahunya ke 16, Enola mendapati ibunya pergi meninggalkanya dengan meninggalkan sebuah kode dan decoder sebagai petunjuk untuk menemukan ibunya. Kepergian ibunya yang mendadak membuat kakak-kakak Enola pulang menemui Enola. Sherlock merasa khawatir dengan adiknya, dia mencoba mencari dimana keberadaan ibunya. Namun Mycroft mengusulkan agar memasukan Enola ke sekolah wanita untuk pendidikan dan belajar menjadi wanita kelas atas. Merasa keberadaan kakak-kakaknya akan mengganggu jalanya mencari sang ibu, Enola memutuskan untuk kabur dari rumah dan memecahkan kode yang ditinggalkan sang ibu sendiri. Dalam perjalannya, Enola bertemu dengan Lord Viscount Tewksbury (Louis Patridge) muda yang ternyata memiliki tujuan yang hampir sama yaitu mencari jati diri mereka. Dengan berbagai lika-liku dan kejutan yang ia temukan selama perjalananya, Enola berubah menjadi sosok detektif wanita yang cerdas mengalahkan kakak-kakaknya.",
                "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1598407079/z5tohxcui4phtsiyeyxu.jpg"
            )
        )


        movies.add(
            Movie(
                1235,
                "Godzilla vs Kong",
                "2021",
                "Godzilla vs Kong menceritakan pertarungan dua kekuatan terbesar di muka bumi. Antara Godzilla, monster evolusi kadal yang menjadi legenda Jepang dengan Kong, gorila raksasa. Kisahnya bermula saat Kong sedang bersama dengan Nathan Lind (Alexander Skarsgard), seorang ahli geologi dan tim Monarch, organisasi misterius yang mencari tahu segala hal tentang monster. Mereka tengah berada dalam perjalanan, bersama dengan seorang anak yatim piatu bernama Jia. Jia memiliki bakat khusus sehingga membuat ia bisa berkomunikasi dengan Kong. Di tengah perjalanan, saat berada di tengah laut, tiba-tiba sebuah serangan muncul dari dasar laut. Serangan itu menghancurkan kapal tanker yang mereka tumpangi. Ternyata serangan tiba-tiba tersebut merupakan ulah dari Godzilla, pertarungan di tengah laut pun tidak dapat dihindari. Kong berhasil memukul Godzilla hingga terjatuh dan masuk ke dalam laut. Namun, Godzilla tidak mau kalah, ia pergi ke daratan dan menyerang para manusia dengan menyemburkan gelombang listrik dari mulutnya. Kong menyusul ke daratan, berusaha menghentikan Godzilla.\n",
                "https://www.imdb.com/title/tt5034838/mediaviewer/rm4176402177?ref_=tt_ov_i"
            )
        )

        movies.add(
            Movie(
                1224,
                "Kimi no Na Wa",
                "2016",
                "Kimi no Nawa menceritakan tentang dua remaja yang bernama Mitsuha Miyamizu dan Taki Tachibana yang saling bertukar tubuh satu sama lain. Awalnya mereka tidak menyadari pertukaran tubuh itu, mereka menganggapnya hanya mimpi semata. Tetapi orang-orang sekitar mengatakan kepada keduanya mengenai keanehan di diri mereka, belum lagi kejadiannya terjadi lebih dari 3 kali. Sehingga mau tidak mau mereka pun percaya.\n" +
                        "Setelah saling menyadari keadaan satu sama lain, Taki dan Mitsuha sepakat untuk mencatat keseharian mereka dan menyampaikan hal-hal apa saja yang tidak boleh dilakukan satu sama lain agar tidak dicurigai oleh orang-orang sekitar.\n" +
                        "Selama bertukar tubuh itu, mereka merasa terikat satu sama lain, bahkan tanpa sadar Mitsuha jatuh cinta kepada Taki. Mitsuha pun dengan penuh keyakinan menyusul Taki. Melakukan perjalanan menggunakan kereta dari Desa Itomori ke Tokyo.\n" +
                        "Tetapi apa yang Mitsuha dapatkan di sana membuat ia sakit hati. Taki tidak mengenali nya sama sekali. Hingga akhirnya dengan nekad ia memberikan ikat rambut berwarna merah miliknya kepada Taki yang kemudian dipakai menjadi gelang azimat oleh lelaki itu.\n" +
                        "Dari sisi Taki sendiri setelah ia menyadari pertukaran tubuhnya dengan Mitsuha, ia berencana menemui gadis itu di Desa Itomori. Tetapi yang ia dapatkan di sana hanyalah sebuah desa yang telah porak poranda akibat bencana meteor jatuh pada 3 tahun yang lalu. Barulah ia sadar bahwa ia melakukan pertukaran tubuh dengan gadis yang sudah tiada.\n" +
                        "Tetapi, Taki tidak ingin menyerah, ia berusaha mengingat-ngingat apapun petunjuk yang bisa membawanya kepada Mitsuha hingga akhirnya dia nekat untuk pergi ke gunung tempat makam keluarga Miyamizu. Di sana ia meminum sake yang dibuat oleh Mitsuha sebagai persembahan. Dari sinilah mereka akan bertemu kembali ketika Kataware-doki.",
                "https://static.wikia.nocookie.net/kiminonawa/images/6/62/Kimi-no-Na-wa.-Visual.jpg/revision/latest/scale-to-width-down/300?cb=20160927170951"
            )
        )

        movies.add(
            Movie(
                1223,
                "Mine",
                "2016",
                "Penembak jitu marinir AS Sersan Mike Steven dan Tommy Madison menjalankan misi di tengah padang pasir, sebuah area yang dipenuhi dengan 33 juta ranjau. Mike diminta untuk mencari dan menangkap pemimpin teroris berbahaya. Suatu saat Mike dan Tommy ditemukan oleh musuh dan diserang.Namun, badai pasir memaksa musuh mundur, meninggalkan Mike dan Tommy.Untuk menyelamatkan diri keduanya diperintahkan untuk ke desa yang nantinya akan dijemput setelah badai pasir berhenti. Namun, saat perjalanan, Tommy menginjak ranjau darat. Tommy meminta agar Mike mengabaikannya, dan Tommy menembak dirinya sendiri dengan pistol. Mike diminta untuk mencari dan menangkap pemimpin teroris berbahaya.Suatu saat Mike dan Tommy ditemukan oleh musuh dan diserang. Namun, badai pasir memaksa musuh mundur, meninggalkan Mike dan Tommy. Untuk menyelamatkan diri keduanya diperintahkan untuk ke desa yang nantinya akan dijemput setelah badai pasir berhenti.Namun, saat perjalanan, Tommy menginjak ranjau darat. Tommy meminta agar Mike mengabaikannya, dan Tommy menembak dirinya sendiri dengan pistol.",
                "https://www.imdb.com/title/tt3707104/mediaviewer/rm1063795968/"
            )
        )


        movies.add(
            Movie(
                1236,
                "Tall Girl",
                "2019",
                "Tall Girl menceritakan seorang gadis remaja bernama Jodi Kreyman (Ava Michelle) yang merasa tidak percaya diri dengan postur tubuhnya. Sejak usia tiga tahun, Jodi selalu menjadi yang paling tinggi di antara teman-temannya. Menginjak SMA, tinggi tubuhnya mencapai 1,87 meter hingga ia kerap diledek oleh teman-teman sekolahnya. Rasa tidak percaya dirinya semakin menjadi-jadi setiap melihat kakak perempuannya, Harper (Sabrina Carpenter). Harper sering menjadi pemenang kontes kecantikan sehingga dianggap sempurna oleh orang-orang di sekitarnya. Beruntung Jodi memiliki sahabat sejak kecil, Dunkleman (Griffin Gluck), yang sebetulnya menyukai Jodi lebih dari sekadar sahabat. Bahkan Dunkleman tidak segan menunjukkan rasa sukanya kepada Jodi secara blak-blakan. Sayangnya, Jodi selalu menolak ajakan Dunkleman untuk berkencan. Salah satu alasannya karena Dunkleman lebih pendek daripada Jodi. Suatu hari, sekolah mereka kedatangan murid pertukaran pelajar dari Swedia, Stig Mohlin (Luke Eisner). Memiliki wajah tampan, Stig langsung menjadi idola banyak murid di sekolah, termasuk Jodi. Namun, Jodi merasa tak punya kesempatan untuk bisa dekat dengan Stig. Terlebih, ada Kimmy Stitcher (Clara Wilsey), musuh bebuyutan Jodi di sekolah yang juga terang-terangan menunjukkan ketertarikan kepada Stig. Peluang datang ketika Jodi tahu bahwa ternyata Stig tinggal di rumah Dunkleman. Keluarga Dunkleman memang terdaftar sebagai family host untuk murid pertukaran pelajar di sekolah. Jodi akhirnya meminta bantuan Harper agar Stig tertarik kepadanya. Bersama sang ibu (Angela Kinsey), Harper melakukan makeover untuk Jodi. Apakah usaha Jodi dalam mendekati Stig akan berhasil?",
                "https://id.wikipedia.org/w/index.php?title=Berkas:Poster_Film_Tall_Girl.jpeg&filetimestamp=20200921135304&"
            )
        )

        movies.add(
            Movie(
                1237,
                "Tenki no Ko",
                "2019",
                "Tenki no Ko bercerita tentang seorang anak laki-laki dan perempuan yang mengetahui bahwa takdirnya menjadi berantakan saat keseimbangan cuaca menjadi kacau. Hotaka Morisaki, siswa SMA yang berlari keluar rumahnya dari sebuah pulau terpencil di Jepang, bertemu seorang gadis bernama Hira Amano. Hira Amano adalah seorang gadis yang memiliki kekuatan misterius yang dapat membuat cuaca cerah hanya dengan “berdoa”, di Tokyo.",
                "https://i.redd.it/nlf34se7m0421.jpg"
            )
        )

        movies.add(
            Movie(
                1232,
                "The Kissing Booth",
                "2018",
                "Elle jatuh cinta pada kakak laki-laki sahabatnya sendiri. Tapi hal itu melanggar aturan persahabatan mereka # 9. Dia mencoba menyembunyikan perasaannya, tetapi semuanya berantakan ketika Elle dan sahabatnya Lee mengatur sebuah stan berciuman saat festival di sekolah. Lahir pada hari yang sama di rumah sakit yang sama, Elle Evans dan Lee Flynn telah menjadi sahabat sepanjang hidup mereka.Untuk melindungi hubungan spesial itu, mereka menciptakan seperangkat aturan persahabatan yang sudah disumpah. Namun, setelah bertemu secara kebetulan di sebuah stan berciuman, Elle sadar cinta pertamanya pada kakak lelaki Lee yang terkenal nakal, Noah Flynn (Jacob Elordi). Segera, percintaan dengan Noah berkembang dan Elle sadar dirinya melanggar aturan dan menyakiti Lee. Ketegangan pun memuncak antara kedua bersaudara itu. Elle pun harus menghadapi kenyataan kehilangan keduanya. Akankah Elle memilih untuk mengikuti aturan atau mengikuti hatinya?\n",
                "https://en.wikipedia.org/wiki/The_Kissing_Booth_2#/media/File:The_Kissing_Booth_2_poster.jpg"
            )
        )

        movies.add(
            Movie(
                4321,
                "Alita : Battle Angel",
                "2019",
                "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa",
                "https://www.imdb.com/title/tt0437086/mediaviewer/rm924018944/"
            )
        )

        movies.add(
            Movie(
                1254,
                "Avengers : Infinity War",
                "2018",
                "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                "https://www.imdb.com/title/tt4154756/mediaviewer/rm4044245504/"
            )
        )

        movies.add(
            Movie(
                5432,
                "Bohemian Rhapsody",
                "2018",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "https://www.imdb.com/title/tt1727824/mediaviewer/rm2666152448/"
            )
        )

        return movies
    }

    fun generateTvShows(): List<TVShow> {

        val tvShow = ArrayList<TVShow>()

        tvShow.add(
            TVShow(
                7654,
                "Stranger Things",
                "2016",
                "Kota Hawkins merupakan sebuah kota kecil yang damai dan tenteram. Namun pada Bulan November 1983, kota tersebut dihebohkan dengan misteri hilangnya seorang anak berusia 12 tahun bernama Will Byers. Will hilang tanpa jejak bagai ditelan malam, sekembalinya ia dari bermain board game Dungeon & Dragons di rumah salah satu sahabatnya, Michael ‘Mike’ Wheeler.\n" +
                        "Joyce Byres, ibunda Will pun kelabakan dan melaporkan kejadian tersebut pada kepala polisi Jim Hopper. Ikatan persahabatan antara Will dengan Mike, Dustin Henderson dan Lucas Sinclair juga akhirnya membawa ketiga anak itu untuk menyelidiki misteri hilangnya sobat karib mereka tersebut. Joyce sendiri kemudian mengalami peristiwa-peristiwa aneh di rumahnya. Mulai dari panggilan telepon janggal, gangguan listrik yang membuat sebuah radio tape menyala sendiri, hingga sosok mengerikan yang seolah berusaha untuk keluar dari balik tembok rumahnya. Sementara itu, Mike dan kawan-kawan bertemu dengan seorang anak perempuan misterius. Mike kemudian menyebut gadis kecil tersebut dengan panggilan Eleven, karena sebuah tato yang menunjukan angka 011 tergambar di tangannya.\n" +
                        "Hilangnya Will, kemunculan Eleven, ditambah serangkaian peristiwa yang tidak dapat diterima oleh logika, lambat laun mulai menguak apa yang sebenarnya tengah terjadi di Hawkins saat itu.",
                "https://en.wikipedia.org/wiki/Stranger_Things_(season_2)#/media/File:Stranger_Things_season_2.jpg"
            )
        )

        tvShow.add(
            TVShow(
                4564,
                "Bridgerton",
                "2020",
                "Kisahnya berpusat pada drama kehidupan dan romansa para bangsawan Inggris di awal tahun 1800-an. Diceritakan keluarga Bridgerton harus mengalami pasang surut mengarungi kehidupan kelas atas bangsawan di Kota London. Begitu pun dengan anak-anak mereka yang juga harus mengikuti banyak tradisi, salah satunya ajang perjodohan antar bangsawan. Putri keempat keluarga Bridgerton yang bernama Dhapne (Phoebe Dynevor) pun tak luput dari ajang ini. Dhapne diharapkan dapat mengikuti tradisi dengan baik, yaitu menemukan pasangan dan menikah seperti orang tuanya dulu. Ia awalnya kesulitan bertemu pria yang tepat karena dinilai terlalu jujur dan ceria untuk dirayu para pria.Namun, perlahan posisinya dalam ajang ini terus merangkak naik. Tak hanya itu, Dhapne juga memulai petualangan baru dengan menjalin kasih secara sembunyi-sembunyi. Pria itu adalah Duke of Hasting (Rege Jean Pege), bangsawan tampan berjiwa pemberontak yang berhasil mencuri hatinya. Hasting menolak ajang perjodohan ini dan tidak tertarik pada ikatan pernikahan. Meski memiliki pandangan hidup berbeda, baik Dhapne dan Hasting mampu meramu perbedaan ini dan saling jatuh cinta. Cerita semakin seru dengan hadirnya Lady Whistledown (Julie Andrews), kolumnis jenaka dan sarkastis yang belum lama menyebar rumor melalui tulisannya. Rumor ini berupa skandal yang dilakukan oleh anggota bangsawan dan sukses membuat heboh. Mungkinkah skandal yang dimaksud adalah hubungan terselubung Dhapne dan Hasting?",
                "https://images6.fanpop.com/image/photos/43600000/-Bridgerton-Season-1-poster-bridgerton-netflix-series-43618653-1080-1350.jpg"
            )
        )

        tvShow.add(
            TVShow(
                3456,
                "Dark",
                "2018",
                "Dark adalah serial original Netflix yang berbahasa Jerman yang bermula ketika Erik, seorang anak SMA di sebuah kota kecil bernama Winden di Jerman, hilang secara misterius. Lalu, Jonas, salah satu tokoh utama kita pergi bersama teman-temannya untuk mencari paket narkoba yang mungkin ditinggalkan Erik di sebuah goa. Setelah mereka berhasil mendapatkan paket tersebut, suatu kejadian aneh terjadi dan mereka kehilangan satu anggota mereka yang paling kecil, Mikkel, yang juga hilang dengan misterius. Merasa bertanggung jawab, Jonas berusaha mencari keberadaan Mikkel yang membawanya kepada fakta yang mengejutkan tentang kota Winden.",
                "http://www.impawards.com/intl/austria/2018/posters/dark_ver2.jpg"
            )
        )

        tvShow.add(
            TVShow(
                3667,
                "Shokugeki No Souma",
                "2015",
                "Bercerita tentang koki muda bernama Yukihira Souma, sejak kecil dia sudah sering membantu ayahnya bekerja di restoran. Karena minatnya dalam memasak, dia selalu mengembangkan kreatifitas setiap tahunnya dalam membekikan menu istimewa untuk disajikan ke pelanggan.\n" +
                        "Tapi pada suatu ketika ayahnya memutuskan untuk menutup restoran tersebut dan menyuruh Souma untuk bersekolah di sekolah kuliner yang ketat, Akademi Kuliner Totsuki. Karena sebelumnya dia pernah dianggap rendah di sekolah bergengsi. Di sana dia bertujuan untuk menjadi koki nomor 1 di sekolah akademi nya. Satu-satunya cara untuk mewujudkan keinginannya ialah harus mengambil bagian dalam Shokugeki, dengan pertarungan 1 lawan 1 yang beresiko tinggi di antara siswa. Dapatkah Souma mewujudkan keinginan nya menjadi koki nomor 1?",
                "https://www.imdb.com/title/tt4731072/mediaviewer/rm1039066880/"
            )
        )

        tvShow.add(
            TVShow(
                3465,
                "Detective Conan ",
                "1994",
                "Shinichi Kudo, seorang detektif SMA berusia 17 tahun yang biasanya membantu polisi memecahkan kasus, diserang oleh 2 anggota sindikat misterius ketika mengawasi sebuah pemerasan. Ia kemudian diberi minum racun misterius yang baru selesai dikembangkan untuk membunuhnya. Namun, karena sebuah efek samping yang jarang terjadi yang tidak diketahui anggota sindikat tersebut, racun tersebut mengakibatkan tubuhnya mengecil seperti anak kecil berusia tujuh tahun setelah mereka meninggalkannya.\n" +
                        "\n" +
                        "Untuk menyembunyikan identitasnya dan untuk menginvestigasi keadaan sindikat tersebut, yang selanjutnya dikenal dengan nama Organisasi Berbaju Hitam atau Organisasi Hitam, dia menyamarkan namanya menjadi Conan Edogawa. Untuk mencari jejak sindikat tersebut, dia tinggal bersama dengan teman sejak kecilnya, Ran Mouri, yang ayahnya, Kogoro Mouri, merupakan seorang detektif swasta. Dia bersekolah di SD Teitan dan membentuk Grup Detektif Cilik dengan 3 teman sekelasnya, yaitu: Ayumi Yoshida, Mitsuhiko Tsuburaya, dan Genta Kojima. Meskipun tubuhnya mengecil, ia tetap memecahkan kasus. Biasanya, ia menyelesaikan kasus-kasus tersebut dengan meniru suara Kogoro Mouri dengan alat yang diciptakan oleh tetangganya, Profesor Agasa.\n" +
                        "\n" +
                        " Kogoro Mouri, seorang detektif yang agak bodoh, awalnya bingung pada kemampuan memecahkan kasusnya meningkat secara mendadak. Tetapi, kemudian ia tidak heran karena ia senang karena ketenarannya yang meningkat. Ran Mouri pernah beberapa kali mencurigai bahwa Conan adalah Shinichi, namun karena kecerdikan Conan, maka Ran pun percaya bahwa Conan bukanlah Shinichi.\n" +
                        "\n" +
                        "Selanjutnya dalam seri ini, tokoh utama lainnya, Ai Haibara, muncul. Ai adalah seorang mantan anggota Organisasi Hitam, yang memiliki nama sandi \"Sherry\". Nama aslinya adalah Shiho Miyano, seorang ilmuan yang mengembangkan racun APTX 4869 yang membuat tubuh Shinichi mengecil. Setelah kakaknya secara kejam dibunuh oleh anggota Organisasi Hitam, ia mencoba keluar dari organisasi itu, namun ia ditangkap. Dia mencoba bunuh diri dengan menelan pil APTX 4869, namun ternyata tubuhnya mengecil, dan dia berhasil kabur dari organisasi tersebut. Dia kemudian bersekolah di SD Teitan dengan nama samaran \"Ai Haibara\". Dia mengetahui identitas asli Conan dan membantunya dalam perjuangan Conan untuk menjatuhkan Organisasi Hitam.\n" +
                        "\n" +
                        "Kemudian, Conan terlibat dengan Biro Investigasi Federal (FBI), dan mereka berhasil menangkap Kir, seorang anggota Organisasi Hitam. Kir kemudian diketahui merupakan seorang agen CIA yang menyamar, dan berjanji akan memberi informasi tentang Organisasi Hitam kepada FBI. Mereka kemudian mengembalikan Kir ke organisasi tersebut. Kemudian, dia memberitahukan kepada FBI bahwa di Organisasi Hitam ada seorang anggota baru dengan nama sandi Bourbon.",
                "https://images-na.ssl-images-amazon.com/images/I/51e8vCs31VL._AC_.jpg"
            )
        )

        tvShow.add(
            TVShow(
                3456,
                "Sweet Home",
                "2020",
                "Sweet Home mengangkat cerita tentang kondisi dunia di mana manusia berubah menjadi monster karena keinginan terdalam dari dalam diri mereka.Cerita diawali dengan seorang pemuda bernama Cha Hyun Su (Song Kang) yang pindah ke apartemen kumuh bernama Green Home. Ia pindah seorang diri setelah kehilangan seluruh anggota keluarganya karena kecelakaan tragis. Semenjak pindah, Cha Hyun Su yang digambarkan sebagai seorang penyendiri ini kerap mengalami kejadian aneh. Tiba-tiba saja, satu per satu manusia yang berada di wilayah tersebut berubah menjadi monster.",
                "https://en.wikipedia.org/wiki/Sweet_Home_(TV_series)#/media/File:Sweet_Home_TV_series.jpg"
            )
        )

        tvShow.add(
            TVShow(
                7565,
                "The Walking Dead",
                "2010",
                "The Walking Dead terjadi setelah permulaan sebuah kiamat zombi di seluruh dunia. Zombi-zombi yang biasa disebut walker tersebut, berjalan menuju manusia dan makhluk hidup lainnya untuk memakannya (mereka tertarik pada kebisingan, misalnya suara tembakan, dan aroma yang berbeda, misalnya aroma manusia). Manusia yang mereka gigit atau cakar menjadi terinfeksi dan perlahan berubah menjadi walker juga. Terungkap di awal serial bahwa semua manusia yang hidup membawa patogen ini, sehingga jika mereka meninggal karena sebab lain, mereka juga akan berubah menjadi walker. Satu-satunya cara untuk membunuh walker secara permanen adalah dengan merusak otaknya atau menghancurkan seluruh tubuhnya, seperti dengan mengkremasinya.\n" +
                        "Cerita serial ini berpusat pada deputi sherif Rick Grimes, yang terbangun dari koma dan menemukan kiamat ini. Dia menjadi pemimpin sekelompok penyintas dari wilayah Atlanta, Georgia sebagaimana mereka mencoba untuk mempertahankan diri dan melindungi diri mereka sendiri tidak hanya terhadap serangan walker, tetapi juga oleh kelompok penyintas lainnya yang akan melakukan hal apapun yang diperlukan demi menjamin hidup mereka.",
                "https://upload.wikimedia.org/wikipedia/id/f/fc/Walking_Dead_S2_Poster.jpg"
            )
        )

        tvShow.add(
            TVShow(
                5674,
                "One Piece",
                "1997",
                "One Piece menceritakan tentang petualangan seorang anak bernama Monkey D. Luffy yang bercita-cita menjadi raja bajak laut dan menemukan \"One Piece\" setelah terinspirasi oleh Shanks. Sekitar 22 tahun sebelum cerita dimulai, seorang bajak laut bernama Gol D. Roger, atau lebih dikenal sebagai raja bajak laut dieksekusi mati di depan publik. Tepat sebelum kematiannya, ia mengumumkan kepada orang banyak tentang harta miliknya, One Piece, yang diklaim sebagai harta terbesar yang pernah ada.\n" +
                        "Kematian Roger memicu dimulainya era \"Zaman Keemasan Bajak Laut\", ditandai turunnya banyak bajak laut hingga tak terhitung jumlahnya mencari harta karun. Luffy termasuk salah satu yang berniat menemukan One Piece dan menjadi raja bajak laut berikutnya, turun ke laut untuk memulai petualangannya serta mulai mengumpulkan beberapa kru sebagai teman seperjalanan.",
                "https://www.seekpng.com/png/full/387-3874553_one-piece-wallpaper-hd-phone.png"
            )
        )

        tvShow.add(
            TVShow(
                9876,
                "Your Lie In April",
                "2016",
                "Menceritakan tentang seorang siswa SMA bernama Kousei Arima yang memutuskan untuk tidak lagi bermain piano. Perlahan semua itu berubah setelah ia bertemu dengan seorang siswi SMA yang bernama Kaori Miyazono. Cara Kaori untuk membujuk Kousei untuk bermain piano lagi adalah dengan menjadikan ia pengiringnya di sebuah kontes biola. Selain berhasil membuat dirinya bermain piano lagi, Kosei juga berhasil dibuat jatuh cinta kepada Kaori.\n",
                "https://www.imdb.com/title/tt3895150/mediaviewer/rm2606994433/"
            )
        )

        tvShow.add(
            TVShow(
                3875,
                "Anohana",
                "2011",
                "Setelah tragedi kecelakaan tragis yang menimpa Menma, salah satu sahabat kecil Jinta, ia menjadi shock dan tidak pernah mau lagi bertemu dengan teman-teman masa kecilnya. Jinta yang tadinya periang menjadi pemurung dan mulai mengurung diri di dalam rumah. Ia menarik diri dari masyarakat, seolah hidup tanpa masa depan. Sepuluh tahun kemudian, tepatnya di musim panas, terjadi hal mengejutkan yaitu munculnya  arwah Menma di hadapan Jinta. Ia pun harus mengumpulkan kembali teman-teman masa kecilnyanya dan menyelesaikan semua masalah di antara mereka.",
                "https://www.imdb.com/title/tt1913273/mediaviewer/rm229325056/"
            )
        )

        return tvShow
    }

    fun generateDummyDetailMovie(): List<DetailShow> {

        val dummyDetail = ArrayList<DetailShow>()

        dummyDetail.add(
            DetailShow(
                1234,
                "Enola Holmes",
                "2020",
                "Enola Holmes film terbaru di Netflix yang bercerita tentang seorang gadis remaja usia 16 tahun bernama Enola. Enola adalah anak terkahir di keluarga Holmes sebuah klan detektif terkenal Sherlock Holmes.\n" +
                        "Setelah kematian ayahnya dan kepergian kakak laki-lakinya, Enola hanya tinggal dan dibesarkan oleh ibunya, Eudoria Holmes. Dari ibunya Enola mendapat ilmu sains dan bela diri jinjutsu. Namun tepat di hari ulang tahunya ke 16, Enola mendapati ibunya pergi meninggalkanya dengan meninggalkan sebuah kode dan decoder sebagai petunjuk untuk menemukan ibunya. Kepergian ibunya yang mendadak membuat kakak-kakak Enola pulang menemui Enola. Sherlock merasa khawatir dengan adiknya, dia mencoba mencari dimana keberadaan ibunya. Namun Mycroft mengusulkan agar memasukan Enola ke sekolah wanita untuk pendidikan dan belajar menjadi wanita kelas atas. Merasa keberadaan kakak-kakaknya akan mengganggu jalanya mencari sang ibu, Enola memutuskan untuk kabur dari rumah dan memecahkan kode yang ditinggalkan sang ibu sendiri. Dalam perjalannya, Enola bertemu dengan Lord Viscount Tewksbury (Louis Patridge) muda yang ternyata memiliki tujuan yang hampir sama yaitu mencari jati diri mereka. Dengan berbagai lika-liku dan kejutan yang ia temukan selama perjalananya, Enola berubah menjadi sosok detektif wanita yang cerdas mengalahkan kakak-kakaknya.",
                "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1598407079/z5tohxcui4phtsiyeyxu.jpg"
            )
        )


        dummyDetail.add(
            DetailShow(
                1235,
                "Godzilla vs Kong",
                "2021",
                "Godzilla vs Kong menceritakan pertarungan dua kekuatan terbesar di muka bumi. Antara Godzilla, monster evolusi kadal yang menjadi legenda Jepang dengan Kong, gorila raksasa. Kisahnya bermula saat Kong sedang bersama dengan Nathan Lind (Alexander Skarsgard), seorang ahli geologi dan tim Monarch, organisasi misterius yang mencari tahu segala hal tentang monster. Mereka tengah berada dalam perjalanan, bersama dengan seorang anak yatim piatu bernama Jia. Jia memiliki bakat khusus sehingga membuat ia bisa berkomunikasi dengan Kong. Di tengah perjalanan, saat berada di tengah laut, tiba-tiba sebuah serangan muncul dari dasar laut. Serangan itu menghancurkan kapal tanker yang mereka tumpangi. Ternyata serangan tiba-tiba tersebut merupakan ulah dari Godzilla, pertarungan di tengah laut pun tidak dapat dihindari. Kong berhasil memukul Godzilla hingga terjatuh dan masuk ke dalam laut. Namun, Godzilla tidak mau kalah, ia pergi ke daratan dan menyerang para manusia dengan menyemburkan gelombang listrik dari mulutnya. Kong menyusul ke daratan, berusaha menghentikan Godzilla.\n",
                "https://www.imdb.com/title/tt5034838/mediaviewer/rm4176402177?ref_=tt_ov_i"
            )
        )

        dummyDetail.add(
            DetailShow(
                1224,
                "Kimi no Na Wa",
                "2016",
                "Kimi no Nawa menceritakan tentang dua remaja yang bernama Mitsuha Miyamizu dan Taki Tachibana yang saling bertukar tubuh satu sama lain. Awalnya mereka tidak menyadari pertukaran tubuh itu, mereka menganggapnya hanya mimpi semata. Tetapi orang-orang sekitar mengatakan kepada keduanya mengenai keanehan di diri mereka, belum lagi kejadiannya terjadi lebih dari 3 kali. Sehingga mau tidak mau mereka pun percaya.\n" +
                        "Setelah saling menyadari keadaan satu sama lain, Taki dan Mitsuha sepakat untuk mencatat keseharian mereka dan menyampaikan hal-hal apa saja yang tidak boleh dilakukan satu sama lain agar tidak dicurigai oleh orang-orang sekitar.\n" +
                        "Selama bertukar tubuh itu, mereka merasa terikat satu sama lain, bahkan tanpa sadar Mitsuha jatuh cinta kepada Taki. Mitsuha pun dengan penuh keyakinan menyusul Taki. Melakukan perjalanan menggunakan kereta dari Desa Itomori ke Tokyo.\n" +
                        "Tetapi apa yang Mitsuha dapatkan di sana membuat ia sakit hati. Taki tidak mengenali nya sama sekali. Hingga akhirnya dengan nekad ia memberikan ikat rambut berwarna merah miliknya kepada Taki yang kemudian dipakai menjadi gelang azimat oleh lelaki itu.\n" +
                        "Dari sisi Taki sendiri setelah ia menyadari pertukaran tubuhnya dengan Mitsuha, ia berencana menemui gadis itu di Desa Itomori. Tetapi yang ia dapatkan di sana hanyalah sebuah desa yang telah porak poranda akibat bencana meteor jatuh pada 3 tahun yang lalu. Barulah ia sadar bahwa ia melakukan pertukaran tubuh dengan gadis yang sudah tiada.\n" +
                        "Tetapi, Taki tidak ingin menyerah, ia berusaha mengingat-ngingat apapun petunjuk yang bisa membawanya kepada Mitsuha hingga akhirnya dia nekat untuk pergi ke gunung tempat makam keluarga Miyamizu. Di sana ia meminum sake yang dibuat oleh Mitsuha sebagai persembahan. Dari sinilah mereka akan bertemu kembali ketika Kataware-doki.",
                "https://static.wikia.nocookie.net/kiminonawa/images/6/62/Kimi-no-Na-wa.-Visual.jpg/revision/latest/scale-to-width-down/300?cb=20160927170951"
            )
        )

        return dummyDetail
    }

    fun generateDummyDetailTVShow() : List<DetailShow> {
        val dummyDetail = ArrayList<DetailShow>()

        dummyDetail.add(
            DetailShow(
                7654,
                "Stranger Things",
                "2016",
                "Kota Hawkins merupakan sebuah kota kecil yang damai dan tenteram. Namun pada Bulan November 1983, kota tersebut dihebohkan dengan misteri hilangnya seorang anak berusia 12 tahun bernama Will Byers. Will hilang tanpa jejak bagai ditelan malam, sekembalinya ia dari bermain board game Dungeon & Dragons di rumah salah satu sahabatnya, Michael ‘Mike’ Wheeler.\n" +
                        "Joyce Byres, ibunda Will pun kelabakan dan melaporkan kejadian tersebut pada kepala polisi Jim Hopper. Ikatan persahabatan antara Will dengan Mike, Dustin Henderson dan Lucas Sinclair juga akhirnya membawa ketiga anak itu untuk menyelidiki misteri hilangnya sobat karib mereka tersebut. Joyce sendiri kemudian mengalami peristiwa-peristiwa aneh di rumahnya. Mulai dari panggilan telepon janggal, gangguan listrik yang membuat sebuah radio tape menyala sendiri, hingga sosok mengerikan yang seolah berusaha untuk keluar dari balik tembok rumahnya. Sementara itu, Mike dan kawan-kawan bertemu dengan seorang anak perempuan misterius. Mike kemudian menyebut gadis kecil tersebut dengan panggilan Eleven, karena sebuah tato yang menunjukan angka 011 tergambar di tangannya.\n" +
                        "Hilangnya Will, kemunculan Eleven, ditambah serangkaian peristiwa yang tidak dapat diterima oleh logika, lambat laun mulai menguak apa yang sebenarnya tengah terjadi di Hawkins saat itu.",
                "https://en.wikipedia.org/wiki/Stranger_Things_(season_2)#/media/File:Stranger_Things_season_2.jpg"
            )
        )

        dummyDetail.add(
            DetailShow(
                4564,
                "Bridgerton",
                "2020",
                "Kisahnya berpusat pada drama kehidupan dan romansa para bangsawan Inggris di awal tahun 1800-an. Diceritakan keluarga Bridgerton harus mengalami pasang surut mengarungi kehidupan kelas atas bangsawan di Kota London. Begitu pun dengan anak-anak mereka yang juga harus mengikuti banyak tradisi, salah satunya ajang perjodohan antar bangsawan. Putri keempat keluarga Bridgerton yang bernama Dhapne (Phoebe Dynevor) pun tak luput dari ajang ini. Dhapne diharapkan dapat mengikuti tradisi dengan baik, yaitu menemukan pasangan dan menikah seperti orang tuanya dulu. Ia awalnya kesulitan bertemu pria yang tepat karena dinilai terlalu jujur dan ceria untuk dirayu para pria.Namun, perlahan posisinya dalam ajang ini terus merangkak naik. Tak hanya itu, Dhapne juga memulai petualangan baru dengan menjalin kasih secara sembunyi-sembunyi. Pria itu adalah Duke of Hasting (Rege Jean Pege), bangsawan tampan berjiwa pemberontak yang berhasil mencuri hatinya. Hasting menolak ajang perjodohan ini dan tidak tertarik pada ikatan pernikahan. Meski memiliki pandangan hidup berbeda, baik Dhapne dan Hasting mampu meramu perbedaan ini dan saling jatuh cinta. Cerita semakin seru dengan hadirnya Lady Whistledown (Julie Andrews), kolumnis jenaka dan sarkastis yang belum lama menyebar rumor melalui tulisannya. Rumor ini berupa skandal yang dilakukan oleh anggota bangsawan dan sukses membuat heboh. Mungkinkah skandal yang dimaksud adalah hubungan terselubung Dhapne dan Hasting?",
                "https://images6.fanpop.com/image/photos/43600000/-Bridgerton-Season-1-poster-bridgerton-netflix-series-43618653-1080-1350.jpg"
            )
        )

        dummyDetail.add(
            DetailShow(
                3456,
                "Dark",
                "2018",
                "Dark adalah serial original Netflix yang berbahasa Jerman yang bermula ketika Erik, seorang anak SMA di sebuah kota kecil bernama Winden di Jerman, hilang secara misterius. Lalu, Jonas, salah satu tokoh utama kita pergi bersama teman-temannya untuk mencari paket narkoba yang mungkin ditinggalkan Erik di sebuah goa. Setelah mereka berhasil mendapatkan paket tersebut, suatu kejadian aneh terjadi dan mereka kehilangan satu anggota mereka yang paling kecil, Mikkel, yang juga hilang dengan misterius. Merasa bertanggung jawab, Jonas berusaha mencari keberadaan Mikkel yang membawanya kepada fakta yang mengejutkan tentang kota Winden.",
                "http://www.impawards.com/intl/austria/2018/posters/dark_ver2.jpg"
            )
        )

        dummyDetail.add(
            DetailShow(
                3667,
                "Shokugeki No Souma",
                "2015",
                "Bercerita tentang koki muda bernama Yukihira Souma, sejak kecil dia sudah sering membantu ayahnya bekerja di restoran. Karena minatnya dalam memasak, dia selalu mengembangkan kreatifitas setiap tahunnya dalam membekikan menu istimewa untuk disajikan ke pelanggan.\n" +
                        "Tapi pada suatu ketika ayahnya memutuskan untuk menutup restoran tersebut dan menyuruh Souma untuk bersekolah di sekolah kuliner yang ketat, Akademi Kuliner Totsuki. Karena sebelumnya dia pernah dianggap rendah di sekolah bergengsi. Di sana dia bertujuan untuk menjadi koki nomor 1 di sekolah akademi nya. Satu-satunya cara untuk mewujudkan keinginannya ialah harus mengambil bagian dalam Shokugeki, dengan pertarungan 1 lawan 1 yang beresiko tinggi di antara siswa. Dapatkah Souma mewujudkan keinginan nya menjadi koki nomor 1?",
                "https://www.imdb.com/title/tt4731072/mediaviewer/rm1039066880/"
            )
        )

        dummyDetail.add(
            DetailShow(
                3465,
                "Detective Conan ",
                "1994",
                "Shinichi Kudo, seorang detektif SMA berusia 17 tahun yang biasanya membantu polisi memecahkan kasus, diserang oleh 2 anggota sindikat misterius ketika mengawasi sebuah pemerasan. Ia kemudian diberi minum racun misterius yang baru selesai dikembangkan untuk membunuhnya. Namun, karena sebuah efek samping yang jarang terjadi yang tidak diketahui anggota sindikat tersebut, racun tersebut mengakibatkan tubuhnya mengecil seperti anak kecil berusia tujuh tahun setelah mereka meninggalkannya.\n" +
                        "\n" +
                        "Untuk menyembunyikan identitasnya dan untuk menginvestigasi keadaan sindikat tersebut, yang selanjutnya dikenal dengan nama Organisasi Berbaju Hitam atau Organisasi Hitam, dia menyamarkan namanya menjadi Conan Edogawa. Untuk mencari jejak sindikat tersebut, dia tinggal bersama dengan teman sejak kecilnya, Ran Mouri, yang ayahnya, Kogoro Mouri, merupakan seorang detektif swasta. Dia bersekolah di SD Teitan dan membentuk Grup Detektif Cilik dengan 3 teman sekelasnya, yaitu: Ayumi Yoshida, Mitsuhiko Tsuburaya, dan Genta Kojima. Meskipun tubuhnya mengecil, ia tetap memecahkan kasus. Biasanya, ia menyelesaikan kasus-kasus tersebut dengan meniru suara Kogoro Mouri dengan alat yang diciptakan oleh tetangganya, Profesor Agasa.\n" +
                        "\n" +
                        " Kogoro Mouri, seorang detektif yang agak bodoh, awalnya bingung pada kemampuan memecahkan kasusnya meningkat secara mendadak. Tetapi, kemudian ia tidak heran karena ia senang karena ketenarannya yang meningkat. Ran Mouri pernah beberapa kali mencurigai bahwa Conan adalah Shinichi, namun karena kecerdikan Conan, maka Ran pun percaya bahwa Conan bukanlah Shinichi.\n" +
                        "\n" +
                        "Selanjutnya dalam seri ini, tokoh utama lainnya, Ai Haibara, muncul. Ai adalah seorang mantan anggota Organisasi Hitam, yang memiliki nama sandi \"Sherry\". Nama aslinya adalah Shiho Miyano, seorang ilmuan yang mengembangkan racun APTX 4869 yang membuat tubuh Shinichi mengecil. Setelah kakaknya secara kejam dibunuh oleh anggota Organisasi Hitam, ia mencoba keluar dari organisasi itu, namun ia ditangkap. Dia mencoba bunuh diri dengan menelan pil APTX 4869, namun ternyata tubuhnya mengecil, dan dia berhasil kabur dari organisasi tersebut. Dia kemudian bersekolah di SD Teitan dengan nama samaran \"Ai Haibara\". Dia mengetahui identitas asli Conan dan membantunya dalam perjuangan Conan untuk menjatuhkan Organisasi Hitam.\n" +
                        "\n" +
                        "Kemudian, Conan terlibat dengan Biro Investigasi Federal (FBI), dan mereka berhasil menangkap Kir, seorang anggota Organisasi Hitam. Kir kemudian diketahui merupakan seorang agen CIA yang menyamar, dan berjanji akan memberi informasi tentang Organisasi Hitam kepada FBI. Mereka kemudian mengembalikan Kir ke organisasi tersebut. Kemudian, dia memberitahukan kepada FBI bahwa di Organisasi Hitam ada seorang anggota baru dengan nama sandi Bourbon.",
                "https://images-na.ssl-images-amazon.com/images/I/51e8vCs31VL._AC_.jpg"
            )
        )

        return dummyDetail
    }

    fun generateDataDummyMovieResponse(): List<MoviePopular> {
        val dummyData = ArrayList<MoviePopular>()

        dummyData.add(
            MoviePopular(
                1234,
                "Enola Holmes",
                "2020",
                "Enola Holmes film terbaru di Netflix yang bercerita tentang seorang gadis remaja usia 16 tahun bernama Enola. Enola adalah anak terkahir di keluarga Holmes sebuah klan detektif terkenal Sherlock Holmes.\n" +
                        "Setelah kematian ayahnya dan kepergian kakak laki-lakinya, Enola hanya tinggal dan dibesarkan oleh ibunya, Eudoria Holmes. Dari ibunya Enola mendapat ilmu sains dan bela diri jinjutsu. Namun tepat di hari ulang tahunya ke 16, Enola mendapati ibunya pergi meninggalkanya dengan meninggalkan sebuah kode dan decoder sebagai petunjuk untuk menemukan ibunya. Kepergian ibunya yang mendadak membuat kakak-kakak Enola pulang menemui Enola. Sherlock merasa khawatir dengan adiknya, dia mencoba mencari dimana keberadaan ibunya. Namun Mycroft mengusulkan agar memasukan Enola ke sekolah wanita untuk pendidikan dan belajar menjadi wanita kelas atas. Merasa keberadaan kakak-kakaknya akan mengganggu jalanya mencari sang ibu, Enola memutuskan untuk kabur dari rumah dan memecahkan kode yang ditinggalkan sang ibu sendiri. Dalam perjalannya, Enola bertemu dengan Lord Viscount Tewksbury (Louis Patridge) muda yang ternyata memiliki tujuan yang hampir sama yaitu mencari jati diri mereka. Dengan berbagai lika-liku dan kejutan yang ia temukan selama perjalananya, Enola berubah menjadi sosok detektif wanita yang cerdas mengalahkan kakak-kakaknya.",
                "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1598407079/z5tohxcui4phtsiyeyxu.jpg"
            )
        )


        dummyData.add(
            MoviePopular(
                1235,
                "Godzilla vs Kong",
                "2021",
                "Godzilla vs Kong menceritakan pertarungan dua kekuatan terbesar di muka bumi. Antara Godzilla, monster evolusi kadal yang menjadi legenda Jepang dengan Kong, gorila raksasa. Kisahnya bermula saat Kong sedang bersama dengan Nathan Lind (Alexander Skarsgard), seorang ahli geologi dan tim Monarch, organisasi misterius yang mencari tahu segala hal tentang monster. Mereka tengah berada dalam perjalanan, bersama dengan seorang anak yatim piatu bernama Jia. Jia memiliki bakat khusus sehingga membuat ia bisa berkomunikasi dengan Kong. Di tengah perjalanan, saat berada di tengah laut, tiba-tiba sebuah serangan muncul dari dasar laut. Serangan itu menghancurkan kapal tanker yang mereka tumpangi. Ternyata serangan tiba-tiba tersebut merupakan ulah dari Godzilla, pertarungan di tengah laut pun tidak dapat dihindari. Kong berhasil memukul Godzilla hingga terjatuh dan masuk ke dalam laut. Namun, Godzilla tidak mau kalah, ia pergi ke daratan dan menyerang para manusia dengan menyemburkan gelombang listrik dari mulutnya. Kong menyusul ke daratan, berusaha menghentikan Godzilla.\n",
                "https://www.imdb.com/title/tt5034838/mediaviewer/rm4176402177?ref_=tt_ov_i"
            )
        )

        dummyData.add(
            MoviePopular(
                1224,
                "Kimi no Na Wa",
                "2016",
                "Kimi no Nawa menceritakan tentang dua remaja yang bernama Mitsuha Miyamizu dan Taki Tachibana yang saling bertukar tubuh satu sama lain. Awalnya mereka tidak menyadari pertukaran tubuh itu, mereka menganggapnya hanya mimpi semata. Tetapi orang-orang sekitar mengatakan kepada keduanya mengenai keanehan di diri mereka, belum lagi kejadiannya terjadi lebih dari 3 kali. Sehingga mau tidak mau mereka pun percaya.\n" +
                        "Setelah saling menyadari keadaan satu sama lain, Taki dan Mitsuha sepakat untuk mencatat keseharian mereka dan menyampaikan hal-hal apa saja yang tidak boleh dilakukan satu sama lain agar tidak dicurigai oleh orang-orang sekitar.\n" +
                        "Selama bertukar tubuh itu, mereka merasa terikat satu sama lain, bahkan tanpa sadar Mitsuha jatuh cinta kepada Taki. Mitsuha pun dengan penuh keyakinan menyusul Taki. Melakukan perjalanan menggunakan kereta dari Desa Itomori ke Tokyo.\n" +
                        "Tetapi apa yang Mitsuha dapatkan di sana membuat ia sakit hati. Taki tidak mengenali nya sama sekali. Hingga akhirnya dengan nekad ia memberikan ikat rambut berwarna merah miliknya kepada Taki yang kemudian dipakai menjadi gelang azimat oleh lelaki itu.\n" +
                        "Dari sisi Taki sendiri setelah ia menyadari pertukaran tubuhnya dengan Mitsuha, ia berencana menemui gadis itu di Desa Itomori. Tetapi yang ia dapatkan di sana hanyalah sebuah desa yang telah porak poranda akibat bencana meteor jatuh pada 3 tahun yang lalu. Barulah ia sadar bahwa ia melakukan pertukaran tubuh dengan gadis yang sudah tiada.\n" +
                        "Tetapi, Taki tidak ingin menyerah, ia berusaha mengingat-ngingat apapun petunjuk yang bisa membawanya kepada Mitsuha hingga akhirnya dia nekat untuk pergi ke gunung tempat makam keluarga Miyamizu. Di sana ia meminum sake yang dibuat oleh Mitsuha sebagai persembahan. Dari sinilah mereka akan bertemu kembali ketika Kataware-doki.",
                "https://static.wikia.nocookie.net/kiminonawa/images/6/62/Kimi-no-Na-wa.-Visual.jpg/revision/latest/scale-to-width-down/300?cb=20160927170951"
            )
        )

        dummyData.add(
            MoviePopular(
                1223,
                "Mine",
                "2016",
                "Penembak jitu marinir AS Sersan Mike Steven dan Tommy Madison menjalankan misi di tengah padang pasir, sebuah area yang dipenuhi dengan 33 juta ranjau. Mike diminta untuk mencari dan menangkap pemimpin teroris berbahaya. Suatu saat Mike dan Tommy ditemukan oleh musuh dan diserang.Namun, badai pasir memaksa musuh mundur, meninggalkan Mike dan Tommy.Untuk menyelamatkan diri keduanya diperintahkan untuk ke desa yang nantinya akan dijemput setelah badai pasir berhenti. Namun, saat perjalanan, Tommy menginjak ranjau darat. Tommy meminta agar Mike mengabaikannya, dan Tommy menembak dirinya sendiri dengan pistol. Mike diminta untuk mencari dan menangkap pemimpin teroris berbahaya.Suatu saat Mike dan Tommy ditemukan oleh musuh dan diserang. Namun, badai pasir memaksa musuh mundur, meninggalkan Mike dan Tommy. Untuk menyelamatkan diri keduanya diperintahkan untuk ke desa yang nantinya akan dijemput setelah badai pasir berhenti.Namun, saat perjalanan, Tommy menginjak ranjau darat. Tommy meminta agar Mike mengabaikannya, dan Tommy menembak dirinya sendiri dengan pistol.",
                "https://www.imdb.com/title/tt3707104/mediaviewer/rm1063795968/"
            )
        )


        dummyData.add(
            MoviePopular(
                1236,
                "Tall Girl",
                "2019",
                "Tall Girl menceritakan seorang gadis remaja bernama Jodi Kreyman (Ava Michelle) yang merasa tidak percaya diri dengan postur tubuhnya. Sejak usia tiga tahun, Jodi selalu menjadi yang paling tinggi di antara teman-temannya. Menginjak SMA, tinggi tubuhnya mencapai 1,87 meter hingga ia kerap diledek oleh teman-teman sekolahnya. Rasa tidak percaya dirinya semakin menjadi-jadi setiap melihat kakak perempuannya, Harper (Sabrina Carpenter). Harper sering menjadi pemenang kontes kecantikan sehingga dianggap sempurna oleh orang-orang di sekitarnya. Beruntung Jodi memiliki sahabat sejak kecil, Dunkleman (Griffin Gluck), yang sebetulnya menyukai Jodi lebih dari sekadar sahabat. Bahkan Dunkleman tidak segan menunjukkan rasa sukanya kepada Jodi secara blak-blakan. Sayangnya, Jodi selalu menolak ajakan Dunkleman untuk berkencan. Salah satu alasannya karena Dunkleman lebih pendek daripada Jodi. Suatu hari, sekolah mereka kedatangan murid pertukaran pelajar dari Swedia, Stig Mohlin (Luke Eisner). Memiliki wajah tampan, Stig langsung menjadi idola banyak murid di sekolah, termasuk Jodi. Namun, Jodi merasa tak punya kesempatan untuk bisa dekat dengan Stig. Terlebih, ada Kimmy Stitcher (Clara Wilsey), musuh bebuyutan Jodi di sekolah yang juga terang-terangan menunjukkan ketertarikan kepada Stig. Peluang datang ketika Jodi tahu bahwa ternyata Stig tinggal di rumah Dunkleman. Keluarga Dunkleman memang terdaftar sebagai family host untuk murid pertukaran pelajar di sekolah. Jodi akhirnya meminta bantuan Harper agar Stig tertarik kepadanya. Bersama sang ibu (Angela Kinsey), Harper melakukan makeover untuk Jodi. Apakah usaha Jodi dalam mendekati Stig akan berhasil?",
                "https://id.wikipedia.org/w/index.php?title=Berkas:Poster_Film_Tall_Girl.jpeg&filetimestamp=20200921135304&"
            )
        )

        dummyData.add(
            MoviePopular(
                1237,
                "Tenki no Ko",
                "2019",
                "Tenki no Ko bercerita tentang seorang anak laki-laki dan perempuan yang mengetahui bahwa takdirnya menjadi berantakan saat keseimbangan cuaca menjadi kacau. Hotaka Morisaki, siswa SMA yang berlari keluar rumahnya dari sebuah pulau terpencil di Jepang, bertemu seorang gadis bernama Hira Amano. Hira Amano adalah seorang gadis yang memiliki kekuatan misterius yang dapat membuat cuaca cerah hanya dengan “berdoa”, di Tokyo.",
                "https://i.redd.it/nlf34se7m0421.jpg"
            )
        )

        dummyData.add(
            MoviePopular(
                1232,
                "The Kissing Booth",
                "2018",
                "Elle jatuh cinta pada kakak laki-laki sahabatnya sendiri. Tapi hal itu melanggar aturan persahabatan mereka # 9. Dia mencoba menyembunyikan perasaannya, tetapi semuanya berantakan ketika Elle dan sahabatnya Lee mengatur sebuah stan berciuman saat festival di sekolah. Lahir pada hari yang sama di rumah sakit yang sama, Elle Evans dan Lee Flynn telah menjadi sahabat sepanjang hidup mereka.Untuk melindungi hubungan spesial itu, mereka menciptakan seperangkat aturan persahabatan yang sudah disumpah. Namun, setelah bertemu secara kebetulan di sebuah stan berciuman, Elle sadar cinta pertamanya pada kakak lelaki Lee yang terkenal nakal, Noah Flynn (Jacob Elordi). Segera, percintaan dengan Noah berkembang dan Elle sadar dirinya melanggar aturan dan menyakiti Lee. Ketegangan pun memuncak antara kedua bersaudara itu. Elle pun harus menghadapi kenyataan kehilangan keduanya. Akankah Elle memilih untuk mengikuti aturan atau mengikuti hatinya?\n",
                "https://en.wikipedia.org/wiki/The_Kissing_Booth_2#/media/File:The_Kissing_Booth_2_poster.jpg"
            )
        )

        dummyData.add(
            MoviePopular(
                4321,
                "Alita : Battle Angel",
                "2019",
                "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa",
                "https://www.imdb.com/title/tt0437086/mediaviewer/rm924018944/"
            )
        )

        dummyData.add(
            MoviePopular(
                1254,
                "Avengers : Infinity War",
                "2018",
                "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                "https://www.imdb.com/title/tt4154756/mediaviewer/rm4044245504/"
            )
        )

        dummyData.add(
            MoviePopular(
                5432,
                "Bohemian Rhapsody",
                "2018",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "https://www.imdb.com/title/tt1727824/mediaviewer/rm2666152448/"
            )
        )

        return dummyData
    }

    fun generateDataDummyTvShowsResponse(): List<TVShowPopular> {

        val tvShow = ArrayList<TVShowPopular>()

        tvShow.add(
            TVShowPopular(
                7654,
                "Stranger Things",
                "2016",
                "Kota Hawkins merupakan sebuah kota kecil yang damai dan tenteram. Namun pada Bulan November 1983, kota tersebut dihebohkan dengan misteri hilangnya seorang anak berusia 12 tahun bernama Will Byers. Will hilang tanpa jejak bagai ditelan malam, sekembalinya ia dari bermain board game Dungeon & Dragons di rumah salah satu sahabatnya, Michael ‘Mike’ Wheeler.\n" +
                        "Joyce Byres, ibunda Will pun kelabakan dan melaporkan kejadian tersebut pada kepala polisi Jim Hopper. Ikatan persahabatan antara Will dengan Mike, Dustin Henderson dan Lucas Sinclair juga akhirnya membawa ketiga anak itu untuk menyelidiki misteri hilangnya sobat karib mereka tersebut. Joyce sendiri kemudian mengalami peristiwa-peristiwa aneh di rumahnya. Mulai dari panggilan telepon janggal, gangguan listrik yang membuat sebuah radio tape menyala sendiri, hingga sosok mengerikan yang seolah berusaha untuk keluar dari balik tembok rumahnya. Sementara itu, Mike dan kawan-kawan bertemu dengan seorang anak perempuan misterius. Mike kemudian menyebut gadis kecil tersebut dengan panggilan Eleven, karena sebuah tato yang menunjukan angka 011 tergambar di tangannya.\n" +
                        "Hilangnya Will, kemunculan Eleven, ditambah serangkaian peristiwa yang tidak dapat diterima oleh logika, lambat laun mulai menguak apa yang sebenarnya tengah terjadi di Hawkins saat itu.",
                "https://en.wikipedia.org/wiki/Stranger_Things_(season_2)#/media/File:Stranger_Things_season_2.jpg"
            )
        )

        tvShow.add(
            TVShowPopular(
                4564,
                "Bridgerton",
                "2020",
                "Kisahnya berpusat pada drama kehidupan dan romansa para bangsawan Inggris di awal tahun 1800-an. Diceritakan keluarga Bridgerton harus mengalami pasang surut mengarungi kehidupan kelas atas bangsawan di Kota London. Begitu pun dengan anak-anak mereka yang juga harus mengikuti banyak tradisi, salah satunya ajang perjodohan antar bangsawan. Putri keempat keluarga Bridgerton yang bernama Dhapne (Phoebe Dynevor) pun tak luput dari ajang ini. Dhapne diharapkan dapat mengikuti tradisi dengan baik, yaitu menemukan pasangan dan menikah seperti orang tuanya dulu. Ia awalnya kesulitan bertemu pria yang tepat karena dinilai terlalu jujur dan ceria untuk dirayu para pria.Namun, perlahan posisinya dalam ajang ini terus merangkak naik. Tak hanya itu, Dhapne juga memulai petualangan baru dengan menjalin kasih secara sembunyi-sembunyi. Pria itu adalah Duke of Hasting (Rege Jean Pege), bangsawan tampan berjiwa pemberontak yang berhasil mencuri hatinya. Hasting menolak ajang perjodohan ini dan tidak tertarik pada ikatan pernikahan. Meski memiliki pandangan hidup berbeda, baik Dhapne dan Hasting mampu meramu perbedaan ini dan saling jatuh cinta. Cerita semakin seru dengan hadirnya Lady Whistledown (Julie Andrews), kolumnis jenaka dan sarkastis yang belum lama menyebar rumor melalui tulisannya. Rumor ini berupa skandal yang dilakukan oleh anggota bangsawan dan sukses membuat heboh. Mungkinkah skandal yang dimaksud adalah hubungan terselubung Dhapne dan Hasting?",
                "https://images6.fanpop.com/image/photos/43600000/-Bridgerton-Season-1-poster-bridgerton-netflix-series-43618653-1080-1350.jpg"
            )
        )

        tvShow.add(
            TVShowPopular(
                3456,
                "Dark",
                "2018",
                "Dark adalah serial original Netflix yang berbahasa Jerman yang bermula ketika Erik, seorang anak SMA di sebuah kota kecil bernama Winden di Jerman, hilang secara misterius. Lalu, Jonas, salah satu tokoh utama kita pergi bersama teman-temannya untuk mencari paket narkoba yang mungkin ditinggalkan Erik di sebuah goa. Setelah mereka berhasil mendapatkan paket tersebut, suatu kejadian aneh terjadi dan mereka kehilangan satu anggota mereka yang paling kecil, Mikkel, yang juga hilang dengan misterius. Merasa bertanggung jawab, Jonas berusaha mencari keberadaan Mikkel yang membawanya kepada fakta yang mengejutkan tentang kota Winden.",
                "http://www.impawards.com/intl/austria/2018/posters/dark_ver2.jpg"
            )
        )

        tvShow.add(
            TVShowPopular(
                3667,
                "Shokugeki No Souma",
                "2015",
                "Bercerita tentang koki muda bernama Yukihira Souma, sejak kecil dia sudah sering membantu ayahnya bekerja di restoran. Karena minatnya dalam memasak, dia selalu mengembangkan kreatifitas setiap tahunnya dalam membekikan menu istimewa untuk disajikan ke pelanggan.\n" +
                        "Tapi pada suatu ketika ayahnya memutuskan untuk menutup restoran tersebut dan menyuruh Souma untuk bersekolah di sekolah kuliner yang ketat, Akademi Kuliner Totsuki. Karena sebelumnya dia pernah dianggap rendah di sekolah bergengsi. Di sana dia bertujuan untuk menjadi koki nomor 1 di sekolah akademi nya. Satu-satunya cara untuk mewujudkan keinginannya ialah harus mengambil bagian dalam Shokugeki, dengan pertarungan 1 lawan 1 yang beresiko tinggi di antara siswa. Dapatkah Souma mewujudkan keinginan nya menjadi koki nomor 1?",
                "https://www.imdb.com/title/tt4731072/mediaviewer/rm1039066880/"
            )
        )

        tvShow.add(
            TVShowPopular(
                3465,
                "Detective Conan ",
                "1994",
                "Shinichi Kudo, seorang detektif SMA berusia 17 tahun yang biasanya membantu polisi memecahkan kasus, diserang oleh 2 anggota sindikat misterius ketika mengawasi sebuah pemerasan. Ia kemudian diberi minum racun misterius yang baru selesai dikembangkan untuk membunuhnya. Namun, karena sebuah efek samping yang jarang terjadi yang tidak diketahui anggota sindikat tersebut, racun tersebut mengakibatkan tubuhnya mengecil seperti anak kecil berusia tujuh tahun setelah mereka meninggalkannya.\n" +
                        "\n" +
                        "Untuk menyembunyikan identitasnya dan untuk menginvestigasi keadaan sindikat tersebut, yang selanjutnya dikenal dengan nama Organisasi Berbaju Hitam atau Organisasi Hitam, dia menyamarkan namanya menjadi Conan Edogawa. Untuk mencari jejak sindikat tersebut, dia tinggal bersama dengan teman sejak kecilnya, Ran Mouri, yang ayahnya, Kogoro Mouri, merupakan seorang detektif swasta. Dia bersekolah di SD Teitan dan membentuk Grup Detektif Cilik dengan 3 teman sekelasnya, yaitu: Ayumi Yoshida, Mitsuhiko Tsuburaya, dan Genta Kojima. Meskipun tubuhnya mengecil, ia tetap memecahkan kasus. Biasanya, ia menyelesaikan kasus-kasus tersebut dengan meniru suara Kogoro Mouri dengan alat yang diciptakan oleh tetangganya, Profesor Agasa.\n" +
                        "\n" +
                        " Kogoro Mouri, seorang detektif yang agak bodoh, awalnya bingung pada kemampuan memecahkan kasusnya meningkat secara mendadak. Tetapi, kemudian ia tidak heran karena ia senang karena ketenarannya yang meningkat. Ran Mouri pernah beberapa kali mencurigai bahwa Conan adalah Shinichi, namun karena kecerdikan Conan, maka Ran pun percaya bahwa Conan bukanlah Shinichi.\n" +
                        "\n" +
                        "Selanjutnya dalam seri ini, tokoh utama lainnya, Ai Haibara, muncul. Ai adalah seorang mantan anggota Organisasi Hitam, yang memiliki nama sandi \"Sherry\". Nama aslinya adalah Shiho Miyano, seorang ilmuan yang mengembangkan racun APTX 4869 yang membuat tubuh Shinichi mengecil. Setelah kakaknya secara kejam dibunuh oleh anggota Organisasi Hitam, ia mencoba keluar dari organisasi itu, namun ia ditangkap. Dia mencoba bunuh diri dengan menelan pil APTX 4869, namun ternyata tubuhnya mengecil, dan dia berhasil kabur dari organisasi tersebut. Dia kemudian bersekolah di SD Teitan dengan nama samaran \"Ai Haibara\". Dia mengetahui identitas asli Conan dan membantunya dalam perjuangan Conan untuk menjatuhkan Organisasi Hitam.\n" +
                        "\n" +
                        "Kemudian, Conan terlibat dengan Biro Investigasi Federal (FBI), dan mereka berhasil menangkap Kir, seorang anggota Organisasi Hitam. Kir kemudian diketahui merupakan seorang agen CIA yang menyamar, dan berjanji akan memberi informasi tentang Organisasi Hitam kepada FBI. Mereka kemudian mengembalikan Kir ke organisasi tersebut. Kemudian, dia memberitahukan kepada FBI bahwa di Organisasi Hitam ada seorang anggota baru dengan nama sandi Bourbon.",
                "https://images-na.ssl-images-amazon.com/images/I/51e8vCs31VL._AC_.jpg"
            )
        )

        tvShow.add(
            TVShowPopular(
                3456,
                "Sweet Home",
                "2020",
                "Sweet Home mengangkat cerita tentang kondisi dunia di mana manusia berubah menjadi monster karena keinginan terdalam dari dalam diri mereka.Cerita diawali dengan seorang pemuda bernama Cha Hyun Su (Song Kang) yang pindah ke apartemen kumuh bernama Green Home. Ia pindah seorang diri setelah kehilangan seluruh anggota keluarganya karena kecelakaan tragis. Semenjak pindah, Cha Hyun Su yang digambarkan sebagai seorang penyendiri ini kerap mengalami kejadian aneh. Tiba-tiba saja, satu per satu manusia yang berada di wilayah tersebut berubah menjadi monster.",
                "https://en.wikipedia.org/wiki/Sweet_Home_(TV_series)#/media/File:Sweet_Home_TV_series.jpg"
            )
        )

        tvShow.add(
            TVShowPopular(
                7565,
                "The Walking Dead",
                "2010",
                "The Walking Dead terjadi setelah permulaan sebuah kiamat zombi di seluruh dunia. Zombi-zombi yang biasa disebut walker tersebut, berjalan menuju manusia dan makhluk hidup lainnya untuk memakannya (mereka tertarik pada kebisingan, misalnya suara tembakan, dan aroma yang berbeda, misalnya aroma manusia). Manusia yang mereka gigit atau cakar menjadi terinfeksi dan perlahan berubah menjadi walker juga. Terungkap di awal serial bahwa semua manusia yang hidup membawa patogen ini, sehingga jika mereka meninggal karena sebab lain, mereka juga akan berubah menjadi walker. Satu-satunya cara untuk membunuh walker secara permanen adalah dengan merusak otaknya atau menghancurkan seluruh tubuhnya, seperti dengan mengkremasinya.\n" +
                        "Cerita serial ini berpusat pada deputi sherif Rick Grimes, yang terbangun dari koma dan menemukan kiamat ini. Dia menjadi pemimpin sekelompok penyintas dari wilayah Atlanta, Georgia sebagaimana mereka mencoba untuk mempertahankan diri dan melindungi diri mereka sendiri tidak hanya terhadap serangan walker, tetapi juga oleh kelompok penyintas lainnya yang akan melakukan hal apapun yang diperlukan demi menjamin hidup mereka.",
                "https://upload.wikimedia.org/wikipedia/id/f/fc/Walking_Dead_S2_Poster.jpg"
            )
        )

        tvShow.add(
            TVShowPopular(
                5674,
                "One Piece",
                "1997",
                "One Piece menceritakan tentang petualangan seorang anak bernama Monkey D. Luffy yang bercita-cita menjadi raja bajak laut dan menemukan \"One Piece\" setelah terinspirasi oleh Shanks. Sekitar 22 tahun sebelum cerita dimulai, seorang bajak laut bernama Gol D. Roger, atau lebih dikenal sebagai raja bajak laut dieksekusi mati di depan publik. Tepat sebelum kematiannya, ia mengumumkan kepada orang banyak tentang harta miliknya, One Piece, yang diklaim sebagai harta terbesar yang pernah ada.\n" +
                        "Kematian Roger memicu dimulainya era \"Zaman Keemasan Bajak Laut\", ditandai turunnya banyak bajak laut hingga tak terhitung jumlahnya mencari harta karun. Luffy termasuk salah satu yang berniat menemukan One Piece dan menjadi raja bajak laut berikutnya, turun ke laut untuk memulai petualangannya serta mulai mengumpulkan beberapa kru sebagai teman seperjalanan.",
                "https://www.seekpng.com/png/full/387-3874553_one-piece-wallpaper-hd-phone.png"
            )
        )

        tvShow.add(
            TVShowPopular(
                9876,
                "Your Lie In April",
                "2016",
                "Menceritakan tentang seorang siswa SMA bernama Kousei Arima yang memutuskan untuk tidak lagi bermain piano. Perlahan semua itu berubah setelah ia bertemu dengan seorang siswi SMA yang bernama Kaori Miyazono. Cara Kaori untuk membujuk Kousei untuk bermain piano lagi adalah dengan menjadikan ia pengiringnya di sebuah kontes biola. Selain berhasil membuat dirinya bermain piano lagi, Kosei juga berhasil dibuat jatuh cinta kepada Kaori.\n",
                "https://www.imdb.com/title/tt3895150/mediaviewer/rm2606994433/"
            )
        )

        tvShow.add(
            TVShowPopular(
                3875,
                "Anohana",
                "2011",
                "Setelah tragedi kecelakaan tragis yang menimpa Menma, salah satu sahabat kecil Jinta, ia menjadi shock dan tidak pernah mau lagi bertemu dengan teman-teman masa kecilnya. Jinta yang tadinya periang menjadi pemurung dan mulai mengurung diri di dalam rumah. Ia menarik diri dari masyarakat, seolah hidup tanpa masa depan. Sepuluh tahun kemudian, tepatnya di musim panas, terjadi hal mengejutkan yaitu munculnya  arwah Menma di hadapan Jinta. Ia pun harus mengumpulkan kembali teman-teman masa kecilnyanya dan menyelesaikan semua masalah di antara mereka.",
                "https://www.imdb.com/title/tt1913273/mediaviewer/rm229325056/"
            )
        )

        return tvShow
    }
}