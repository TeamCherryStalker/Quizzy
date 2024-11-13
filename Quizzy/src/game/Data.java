package game;
public class Data 
{
	static String[] tabuleiro = {"Qual das opções abaixo é um famoso jogo de tabuleiro brasileiro?", 
			"Qual jogo de tabuleiro é conhecido por seus temas envolvendo guerra?", 
			"Em Banco Imobiliário, qual carta lhe permite sair da prisão?",
			"Quais dos jogos a seguir remete um acontecimento pelo qual o mundo passou por?",
			"Quais desses pares de jogos têm jogabilidade parecida?",
			"Qual dessas famosas empresas de jogos de tabuleiro não é brasileira?",
			"Qual desses jogos abaixo não precisam de dados para serem jogados?",
			"Quais desses itens podem ser encontrados no jogo Catan?",
			"Destes jogos, qual necessita de uma roleta para ser jogado?",
			"De qual jogo de tabuleiro são essas peças?",
			"Em Warhammer 40k, quem é aquele venerado pelo império da humanidade?",
			"Qual é um dos requisitos para o roque no xadrez?",
			"As seguintes afirmações são feitas sobre o clássico jogo Ludo, qual é a falsa?",
			"Quais desses personagens não é um dos suspeitos de Detetive?",
			"Qual desses jogos é o mais antigo?"};
	static String[] carta = {"O que significa 'canastra limpa' no jogo de Canastra?",
			"O que faz o Coringa no jogo pife?",
			"Qual desses tipos de cartas de Pokémon TCG não existe?",
			"Quais desses jogos de cartas se joga sozinho?",
			"Como funcionam os 'coringas' no jogo de UNO?",
			"Qual desses jogos de tabuleiro tem uma versão em cartas, apenas?",
			"Quais dessas alternativas ilustra corretamente como se prepara o jogo Rouba-Monte?",
			"Qual dessas alternativas ilustra corretamente como se joga Dobble?",
			"Qual dessas não é uma carta de ação no jogo Uno?",
			"O que significa 'mão cheia' no jogo de Pife?",
			"O que “52!” representa?",
			"Qual dessas sequências de palavras é o nome de um jogo?",
			"No jogo Canastra, como se chama o terceiro monte que fica em cima da mesa?",
			"De que jogo de cartas essa imagem faz parte? ",
			"Em que jogo de cartas o coringa foi originalmente introduzido?"};
	static String[] jogo = {"Em Pokémon FireRed, quais são os três iniciais que o jogador pode escolher?",
			"Qual foi o jogo mais jogado de 2021 na Steam?",
			"Qual é o jogo mais vendido de todos os tempos?",
			"Qual destes jogos é um jogo de terror?",
			"Qual picareta quebra blocos de pedra mais rápido em Minecraft?",
			"Qual dos seguintes consoles foi o último lançado pela Sega?",
			"Qual o console com maior número de vendas no mundo?",
			"Em 2001 qual desses jogos da franquia Final Fantasy foi lançado?",
			"Qual é a empresa responsável pelo desenvolvimento dos jogos da franquia Donkey Kong Country?",
			"Qual foi o jogo mais bugado em 2020?",
			"Qual foi o primeiro console lançado no mundo?",
			"Qual foi o primeiro jogo do Mario?",
			"Qual jogo da franquia The Legend of Zelda foi lançado para o CD-i?",
			"Qual o nome do diretor da franquia de jogos Dark Souls da empresa FromSoftware?",
			"Quem foi o protagonista do momento 37 da EVO de 2004?",};
	static String[] T = {" Azul", "Ludo", "Banco Imobiliário", "Cobras e escadas", "Catan","Detetive","Catan","WAR","Pandemic","Dune",
			"Fuga", "Habeas Corpus", "Bomba","Corrupção","Suborno","Catan","Pandemic","Ludo","Azul","Monopoly","Catan e Monopoly",
			"Banco Imobiliário e Monopoly","Pandemic e WAR","Detetive e Pandemic","Ludo e Damas","Hasbro", "Galápagos", "Estrela",
			"Pais e Filhos", "Grow","Ludo","Cobra e Escadas", "Perfil", "General", "Detetive", "Dinamite e pão", "Pedra e carne",
			"Madeira e lã", "Escudo e carvão", "Água e dinamite", "Detetive", "Pandemic", "Twister", "Perfil", "Azul", "Catan", "Azul",
			"Dixit", "Twister","Perfil", "The God Emperor of Mankind", "The Lord Emperor of Mankind", "The King", "The Chaos God", "Outro",
			"Um peão deve ter chegado ao final do tabuleiro", "O cavalo deve estar do lado da torre", "O rei e a torre não podem ter se movido antes",
			"A rainha não pode estar bloqueada", "O rei deve ter um bispo ao seu lado", "Você pode matar as peças do adversário", 
			"Usa-se dados", "Começa-se com quatros peças cada jogador", "Cada jogador, obrigatoriamente, joga o dado antes de começar a partida para escolher a ordem",
			"Ganha-se chegando no meio com as quatro peças", "Coronel", "Bibliotecária", "Florista", "Mordomo", "Coveiro", "Ludo", "Xadrez", "Mancala",
			"Dominó", "Azul"};
	static String[] imagensT = {null,null,null,null,null,null,null,null,null,"Dixit.png",null,null,null,null,null};
	static int[] t = {2,2,1,1,1,0,2,2,2,2,0,2,2,1,2};
	static String[] C = {"Uma canastra com todos os naipes iguais", "Uma canastra sem coringas","Uma canastra feita com as primeiras 11 cartas recebidas no início do jogo",
			"Uma canastra com o naipe copas", "Uma canastra com coringas","Ele substitui qualquer carta no jogo, facilitando a montagem das combinações.",
			"Ele deixa o jogador que possui o coringa pular a vez","Ele deixa o jogador comprar três cartas",
			"Ele deixa o jogador mudar de baralho","Ele visualiza uma carta do oponente",
			"Energia","Treinador","Pokémon","Item","Habilidade","Canastra","Pife","Paciência","Uno","Poker",
			"Ele deixa o jogador que possui o coringa pular a vez","Eles permitem o jogador a mudar a cor em jogo",
			"Eles deixam o jogador comprar três cartas","Ele faz o adversário comprar três cartas",
			"Ele sempre muda os baralhos", "Banco Imobiliário", "Detetive", "Catan", "WAR", "Pandemic",
			"São distribuídas 9 cartas para cada jogador e um baralho de compras",
			"Os jogadores começam sem cartas e quarto cartas são colocadas viradas para cima na mesa",
			"Cada jogador escolhe 4 cartas para o seu adversário","Cada jogador deve virar 4 cartas para cima e comprar 3",
			"Dez cartas são distribuídas aleatoriamente para os jogadores","Encontrar pares em quatro cartas",
			"Ter sempre mais cartas ao final do jogo", "Encontrar pares de imagens nas cartas redondas",
			"Comprar duas cartas a cada partida","Sempre acabar com um número par de cartas","Block","Reverse","Trocar mãos",
			"Compra 2","Coringa","Ter todo o baralho em mãos","Ter mais de 9 cartas na mão e não conseguir fazer combinações válidas",
			"Quando o jogador consegue usar todas as suas cartas em combinações válidas","Comprar três cartas para fazer combinações",
			"Não ter combinações válidas ao final do jogo",
			"O número de combinações possíveis em um baralho de cartas comum","Os pontos de um royal flush",
			"O número de cartas de um baralho","Os ponto que se precisa para ter uma high card em poker",
			"Outro","Gato, cavalo, hambúrguer e sorvete","Queijo, requeijão, provolone e mozzarela",
			"Taco, Queijo, Cabra e Pizza","Abacaxi, banana, manga e morango","Jaqueta, calça, blusa e tênis",
			"Monte","Baralho","Morto","Mesa","Mar","Fungi","Entre-linhas","Kariba","Yu-Gi-Oh","Claims","Canastra","Poker",
			"Pife","Blackjack","Paciência"};
	static String[] imagensC = {null,null,null,null,null,null,null,null,null,null,null,null,null,"Ganância.png",null};
	static int[] c = {1,0,4,2,1,1,1,2,2,2,0,2,2,3,1};
	static String[] J = {"Totodile, Chikorita e Cyndaquil","Treecko, Torchic, Mudkip","Chimchar, Turtwig, Piplup",
			"Oshawott, Snivy, Tepig","Bulbasaur, Charmander e Squirtle","PUBG Battlegrounds","God of War Ragnarok",
			"Hogwarts Legacy","Elden Ring","Grand Theft Auto VI","The Witcher III","Minecraft","Grand Theft Auto V",
			"Tetris","Final Fantasy XV","Pokémon","Outlast","Minecraft","Stardew Valley","Final Fantasy XVI",
			"Picareta de pedra","Picareta de diamante","Picareta de netherite","Picareta de ouro","Picareta de ferro",
			"Sega Saturn","Mega Drive","Dreamcast","Sega SG-1000","Sega 32X","Nintendo Switch","Xbox 360","Playstation 2",
			"SNES","GameBoy","Final Fantasy IX","Final Fantasy XI","Final Fantasy XII","Final Fantasy X","Final Fantasy VIII",
			"Ubisoft","Electronic Arts","Rare","Square Enix","FromSoftware","Cyberpunk 2077","The Last of Us: Part II",
			"Hades","Fall Guys","Genshin Impact","Magnavox Odyssey","Atari","Nintendo Wii U","Mega Drive","Super Nintendo - SNES",
			"Super Mario Bros","Super Mario 64","Mario Bros","Donkey Kong","Super Mario Golf","Tri Force Heroes","The Legend of Zelda",
			"Four Swords Adventures","Link: The Faces of Evil","The Legend of Zelda: Link's Awakening","Hidetaka Miyazaki",
			"Yataro Iwasaki","Hideo Kojima","Masaru ibuka","パナソニック株式会社","Nuki","Essei","Justin Wong","Daigo Umehara","週刊少年ジャンプ"};
	static String[] imagensJ = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int[] j = {4,0,3,1,3,2,2,3,2,0,0,2,3,0,3};
	static String[][] perguntas = { tabuleiro, carta, jogo };
	static String[][] opcoes = {T, C, J};
	static int[][] respostas = {t, c, j};
	static int points = 0, combo = 0;
	static String[][] imagens = {imagensT, imagensC, imagensJ};
}